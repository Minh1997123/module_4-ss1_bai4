package com.example.orderservice.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderEntity {
    @Id
    private String orderId;
}
