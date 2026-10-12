package com.example.orderservice.model.dto;

import java.time.LocalDateTime;

public class ApiResponseError {
    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String message;
}
