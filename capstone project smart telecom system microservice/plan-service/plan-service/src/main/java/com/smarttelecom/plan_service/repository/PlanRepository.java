package com.smarttelecom.plan_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smarttelecom.plan_service.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long> {
	List<Plan> findByType(String type);
}
