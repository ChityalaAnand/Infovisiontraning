package com.telecom.plan_service_telecom.exception;
public class NoPlansFoundException extends RuntimeException {
    public NoPlansFoundException(String message) {
        super(message);
    }
}