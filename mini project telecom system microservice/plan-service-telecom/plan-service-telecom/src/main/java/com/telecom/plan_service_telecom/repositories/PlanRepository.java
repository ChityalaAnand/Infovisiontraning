package com.telecom.plan_service_telecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.plan_service_telecom.modals.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {

	boolean existsById(Long id);
}