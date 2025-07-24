package com.smarttelecom.plan_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smarttelecom.plan_service.dto.PlanDTO;
import com.smarttelecom.plan_service.entity.Plan;
import com.smarttelecom.plan_service.exception.InvalidPlanException;
import com.smarttelecom.plan_service.repository.PlanRepository;
import com.smarttelecom.plan_service.strategy.PlanFactory;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class PlanServiceImpl implements PlanService {
	private final PlanRepository planRepository;
	

	@Override
	public List<PlanDTO> getAllPlans(String type) {
	    List<Plan> plans;

	    if (type == null || type.trim().isEmpty()) {
	        plans = planRepository.findAll();
	    } else {
	        plans = planRepository.findByType(type.trim().toUpperCase());
	    }

	    return plans.stream()
	                .map(this::mapToDTO)
	                .toList();
	}


    @Override
    public PlanDTO createPlan(PlanDTO dto) {
        PlanFactory.getPlanType(dto.getType()); // validate type
        Plan plan = mapToEntity(dto);
        return mapToDTO(planRepository.save(plan));
    }

    @Override
    public PlanDTO getPlanById(Long id) {
        return planRepository.findById(id)
                .map(this::mapToDTO)
                .orElseThrow(() -> new InvalidPlanException("Plan not found: " + id));
    }

    @Override
    public void deletePlan(Long id) {
        planRepository.deleteById(id);
    }

    private PlanDTO mapToDTO(Plan plan) {
        return new PlanDTO(plan.getId(), plan.getName(), plan.getType(), plan.getPrice(), plan.getValidity(), plan.getFeatures());
    }

    private Plan mapToEntity(PlanDTO dto) {
        return Plan.builder()
                .name(dto.getName())
                .type(dto.getType())
                .price(dto.getPrice())
                .validity(dto.getValidity())
                .features(dto.getFeatures())
                .build();
    }
	
	/*@Override
	public List<Plan> getAllPlans() {	
		return planRepository.findAll();
	}

	@Override
	public Plan createPlan(Plan plan) {
		return planRepository.save(plan);
	}*/

}
