package com.smarttelecom.user_service.dto;

import lombok.Data;

@Data
public class PlanDTO {
	private Long id;
    private String name;
    private String type;
    private Double price;
    private String validity;
}
