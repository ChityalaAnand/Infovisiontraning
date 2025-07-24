package com.smarttelecom.plan_service.service;
import java.util.List;

import com.smarttelecom.plan_service.dto.PlanDTO;
public interface PlanService {
	//List<Plan> getAllPlans();
	//Plan createPlan(Plan plan);
	List<PlanDTO> getAllPlans(String type);
    PlanDTO createPlan(PlanDTO planDTO);
    PlanDTO getPlanById(Long id);
    void deletePlan(Long id);
}
