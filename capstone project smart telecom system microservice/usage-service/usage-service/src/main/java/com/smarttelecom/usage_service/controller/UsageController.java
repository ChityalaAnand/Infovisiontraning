package com.smarttelecom.usage_service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smarttelecom.usage_service.dto.UsageLogDTO;
import com.smarttelecom.usage_service.service.UsageLogService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/usage")
@AllArgsConstructor
public class UsageController {

    private final UsageLogService usageLogService;

    @PostMapping
    public ResponseEntity<UsageLogDTO> logUsage(@RequestBody @Valid UsageLogDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usageLogService.logUsage(dto));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<UsageLogDTO>> getUserUsage(@PathVariable Long userId) {
        return ResponseEntity.ok(usageLogService.getUsageByUser(userId));
    }
  
    
    
    /* @GetMapping("/user/{userId}")
    public List<UsageLog> getUsageByUser(@PathVariable Long userId) {
        return usageLogService.getUsageByUserId(userId);
    }

    @PostMapping
    public UsageLog saveUsage(@RequestBody UsageLog usageLog) {
        return usageLogService.saveUsageLog(usageLog);
    }*/
}