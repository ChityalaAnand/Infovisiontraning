package com.smarttelecom.usage_service.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UsageDTO {
	private Long userId;
    private LocalDate date;
    private int callDuration;
    private double dataUsed;
    private int smsCount;
}
