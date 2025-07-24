package com.smarttelecom.user_service.service;

import java.util.List;

import com.smarttelecom.user_service.dto.UserDTO;
import com.smarttelecom.user_service.dto.UserWithPlanDTO;

public interface UserService {
	UserDTO createUser(UserDTO userDTO);

	UserDTO getUserById(Long id);

	List<UserDTO> getAllUsers();

	UserDTO updateUser(Long id, UserDTO userDTO);

	void deleteUser(Long id);
	
	UserWithPlanDTO getUserWithPlan(String email);

	UserDTO getCurrentUser(String email);
}
