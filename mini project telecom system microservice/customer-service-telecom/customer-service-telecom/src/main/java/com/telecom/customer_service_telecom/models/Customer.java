package com.telecom.customer_service_telecom.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;

	@NotBlank(message = "Mobile number is mandatory")
	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Mobile number must start with 6-9 and be exactly 10 digits")
	private String mobile;
	
	@Column(unique = true, nullable = false)
	@NotBlank(message = "Email is mandatory")
	@Email(message = "Invalid email format")
	private String email;
}
