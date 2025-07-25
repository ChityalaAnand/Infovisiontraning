package com.smarttelecom.usage_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserUsageDto {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String role;
    private Long planId;
}