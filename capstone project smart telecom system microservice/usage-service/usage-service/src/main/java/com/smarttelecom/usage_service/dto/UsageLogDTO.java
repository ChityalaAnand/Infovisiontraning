package com.smarttelecom.usage_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsageLogDTO {
    private Long userId;
    private int callDuration;
    private double dataUsed;
    private int smsCount;
}
