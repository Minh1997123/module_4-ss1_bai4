package com.example.orderservice.service;


import com.example.orderservice.model.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final DiscoveryClient discoveryClient;

    public void getProductById(Long productId) {

        List<ServiceInstance> instances = discoveryClient.getInstances("PRODUCT-SERVICE");

        if (instances == null || instances.isEmpty()) {
            throw new ResponseStatusException(
                    HttpStatus.SERVICE_UNAVAILABLE,
                    "PRODUCT-SERVICE hiện không khả dụng (Không tìm thấy instance nào)"
            );
        }

        ServiceInstance instance = instances.getFirst();
        String baseUrl = instance.getUri().toString();
        String targetUrl = baseUrl + "/products/" + productId;
    }
}
