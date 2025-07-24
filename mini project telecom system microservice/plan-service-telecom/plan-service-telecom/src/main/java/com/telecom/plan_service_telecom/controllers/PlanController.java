package com.telecom.plan_service_telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.plan_service_telecom.exception.DuplicatePlanException;
import com.telecom.plan_service_telecom.exception.NoPlansFoundException;
import com.telecom.plan_service_telecom.exception.PlanNotFoundException;
import com.telecom.plan_service_telecom.modals.Plan;
import com.telecom.plan_service_telecom.repositories.PlanRepository;
import com.telecom.plan_service_telecom.services.PlanService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/plans")
public class PlanController {

	@Autowired
	private PlanService planService;
	@Autowired
	private PlanRepository planRepository;

	@GetMapping
	public ResponseEntity<?> getAllPlans() {
		List<Plan> plans = planService.getAllPlans();

		if (plans.isEmpty()) {
			throw new NoPlansFoundException("No plans found.");
		}

		return ResponseEntity.ok(plans);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Plan> getPlanById(@PathVariable Long id) {
		Plan plan = planService.getPlanById(id)
				.orElseThrow(() -> new PlanNotFoundException("Plan with ID " + id + " not found"));
		return ResponseEntity.ok(plan);
	}

	@PostMapping
	public ResponseEntity<Plan> savePlan(@RequestBody Plan plan) {
		Plan savedPlan = planRepository.save(plan);
		return ResponseEntity.ok(savedPlan);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePlan(@PathVariable Long id) {
		planService.deletePlan(id);
		return ResponseEntity.ok("Plan with ID " + id + " has been deleted.");
	}
}
