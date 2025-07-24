package com.smarttelecom.user_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.smarttelecom.user_service.dto.PlanDTO;
import com.smarttelecom.user_service.dto.UserDTO;
import com.smarttelecom.user_service.dto.UserWithPlanDTO;
import com.smarttelecom.user_service.entity.User;
import com.smarttelecom.user_service.exception.UserNotFoundException;
import com.smarttelecom.user_service.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	private final RestTemplate restTemplate;

	@Value("${plan.service.url}")
	private String planServiceUrl;

	private UserDTO convertToDto(User user) {
		return UserDTO.builder().id(user.getId()).name(user.getName()).email(user.getEmail()).phone(user.getPhone())
				.role(user.getRole()).planId(user.getPlanId()).build();
	}

	private User convertToEntity(UserDTO dto) {
		return User.builder().id(dto.getId()).name(dto.getName()).email(dto.getEmail()).phone(dto.getPhone())
				.role(dto.getRole()).planId(dto.getPlanId()).build();
	}

	@Override
	public UserDTO getCurrentUser(String email) {
		User user = userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("User not found"));
		return new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getPhone(), user.getRole(),
				user.getPlanId());
	}

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		return convertToDto(userRepository.save(convertToEntity(userDTO)));
	}

	@Override
	public UserDTO getUserById(Long id) {
		User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
		return convertToDto(user);
	}

	@Override
	public List<UserDTO> getAllUsers() {
		return userRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
	}

	@Override
	public UserDTO updateUser(Long id, UserDTO dto) {
		User existing = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
		existing.setName(dto.getName());
		existing.setEmail(dto.getEmail());
		existing.setPhone(dto.getPhone());
		existing.setRole(dto.getRole());
		existing.setPlanId(dto.getPlanId());
		return convertToDto(userRepository.save(existing));
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public UserWithPlanDTO getUserWithPlan(String email) {
		User user = userRepository.findByEmail(email.trim())
				.orElseThrow(() -> new UserNotFoundException("User not found"));
		PlanDTO plan = restTemplate.getForObject(planServiceUrl + "/api/plans/" + user.getPlanId(), PlanDTO.class);
		return new UserWithPlanDTO(user.getId(), user.getName(), user.getEmail(), user.getPhone(), user.getRole(),
				plan);
	}
}
