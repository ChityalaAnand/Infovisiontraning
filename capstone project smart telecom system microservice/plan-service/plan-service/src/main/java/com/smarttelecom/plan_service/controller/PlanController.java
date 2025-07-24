package com.smarttelecom.plan_service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smarttelecom.plan_service.dto.PlanDTO;
import com.smarttelecom.plan_service.service.PlanService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/plans")
@RequiredArgsConstructor
public class PlanController {
	private final PlanService planService;
	

    @GetMapping
    public ResponseEntity<List<PlanDTO>> getAllPlans(
            @RequestParam(required = false) String type) {
        return ResponseEntity.ok(planService.getAllPlans(type));
    }

    @PostMapping
    public ResponseEntity<PlanDTO> createPlan(@RequestBody @Valid PlanDTO dto) {
        return new ResponseEntity<>(planService.createPlan(dto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanDTO> getPlan(@PathVariable Long id) {
        return ResponseEntity.ok(planService.getPlanById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlan(@PathVariable Long id) {
        planService.deletePlan(id);
        return ResponseEntity.noContent().build();
    }
	
	
	
	
	/*@GetMapping
	public ResponseEntity<List<Plan>> getPlans() {
		return ResponseEntity.ok(planService.getAllPlans());
	}
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Plan> addPlan(@RequestBody Plan plan){
		return ResponseEntity.ok(planService.createPlan(plan));
	}*/
}