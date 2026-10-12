package com.example.orderservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private String sku;
    private Double importPrice;
    private Double sellPrice;
    private Integer stockQuantity;
}
