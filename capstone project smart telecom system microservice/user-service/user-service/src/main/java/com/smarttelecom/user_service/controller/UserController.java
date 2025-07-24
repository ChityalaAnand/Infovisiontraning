package com.smarttelecom.user_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smarttelecom.user_service.dto.UserDTO;
import com.smarttelecom.user_service.dto.UserWithPlanDTO;
import com.smarttelecom.user_service.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO dto) {
		return ResponseEntity.ok(userService.createUser(dto));
	}

	@GetMapping("/me")
	public ResponseEntity<UserDTO> getCurrentUser(@RequestHeader("email") String email) {
		return ResponseEntity.ok(userService.getCurrentUser(email));
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
		return ResponseEntity.ok(userService.getUserById(id));
	}

	@GetMapping
	public ResponseEntity<List<UserDTO>> getAll() {
		return ResponseEntity.ok(userService.getAllUsers());
	}

	@PutMapping("/{id}")
	public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO dto) {
		return ResponseEntity.ok(userService.updateUser(id, dto));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		userService.deleteUser(id);
		return ResponseEntity.ok("Deleted");
	}
	
	@GetMapping("/withplan")
    public ResponseEntity<UserWithPlanDTO> getUserWithPlan(@RequestParam String email) {
        UserWithPlanDTO userWithPlan = userService.getUserWithPlan(email);
        return ResponseEntity.ok(userWithPlan);
    }
}