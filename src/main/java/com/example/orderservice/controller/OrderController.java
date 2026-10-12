package com.example.orderservice.controller;

import com.example.orderservice.model.entity.OrderEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Order Service is Up";
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderEntity> getOrder(@PathVariable String id) {
        OrderEntity orderEntity = new OrderEntity(id);
        return   ResponseEntity.ok(orderEntity);
    }
}
