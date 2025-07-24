package com.smarttelecom.billing_service.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UsageLogDTO {
	private Long userId;
	private LocalDate date;
	private int callDuration; // in minutes
	private double dataUsed; // in MB
	private int smsCount;
}
