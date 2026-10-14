package com.example.orderservice.exception;

public class ApiResponseError extends RuntimeException {
    public ApiResponseError(String message) {
        super(message);
    }
}
