package com.telecom.plan_service_telecom.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.plan_service_telecom.exception.PlanNotFoundException;
import com.telecom.plan_service_telecom.modals.Plan;
import com.telecom.plan_service_telecom.repositories.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public Plan savePlan(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    @Override
    public Optional<Plan> getPlanById(Long id) {
        return planRepository.findById(id);
    }
    
    @Override
    public void deletePlan(Long id) {
        if (!planRepository.existsById(id)) {
            throw new PlanNotFoundException("Plan with ID " + id + " not found");
        }
        planRepository.deleteById(id);
    }
}