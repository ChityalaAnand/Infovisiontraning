package com.smarttelecom.plan_service.exception;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidPlanException.class)
    public ResponseEntity<String> handleInvalidPlan(InvalidPlanException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneric(Exception ex) {
        return ResponseEntity.status(HttpStatus.SC_INTERNAL_SERVER_ERROR).body("Error: " + ex.getMessage());
    }
}
