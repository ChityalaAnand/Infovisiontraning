package com.smarttelecom.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWithPlanDTO {
	private Long id;
    private String name;
    private String email;
    private String phone;
    private String role;
    private PlanDTO plan;
}
