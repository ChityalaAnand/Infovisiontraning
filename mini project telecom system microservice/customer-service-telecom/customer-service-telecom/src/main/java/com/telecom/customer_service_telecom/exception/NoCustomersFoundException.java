package com.telecom.customer_service_telecom.exception;


public class NoCustomersFoundException extends RuntimeException {
    public NoCustomersFoundException(String message) {
        super(message);
    }
}