package com.telecom.plan_service_telecom.services;

import java.util.List;
import java.util.Optional;

import com.telecom.plan_service_telecom.modals.Plan;

public interface PlanService {
	Plan savePlan(Plan plan);
    List<Plan> getAllPlans();
    Optional<Plan> getPlanById(Long id);
    void deletePlan(Long id);
}
