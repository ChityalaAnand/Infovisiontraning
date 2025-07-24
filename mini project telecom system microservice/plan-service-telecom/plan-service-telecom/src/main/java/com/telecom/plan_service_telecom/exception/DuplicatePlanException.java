package com.telecom.plan_service_telecom.exception;

public class DuplicatePlanException extends RuntimeException {
    public DuplicatePlanException(String message) {
        super(message);
    }
}