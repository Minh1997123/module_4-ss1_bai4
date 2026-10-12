package com.example.orderservice.controller;

import com.example.orderservice.model.dto.ProductResponseDTO;
import com.example.orderservice.model.entity.ProductEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/product")
public class ProductController {

    @GetMapping
    public ResponseEntity<ProductResponseDTO> getProduct() {
        ProductEntity productEntity = new ProductEntity();
        ProductResponseDTO productResponseDTO = new ProductResponseDTO(productEntity.getId() , productEntity.getName() , productEntity.getSellPrice());
        return ResponseEntity.ok(productResponseDTO);
    }
}
