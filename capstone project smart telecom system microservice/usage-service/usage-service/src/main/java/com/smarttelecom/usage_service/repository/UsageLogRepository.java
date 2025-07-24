package com.smarttelecom.usage_service.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smarttelecom.usage_service.entity.UsageLog;

public interface UsageLogRepository extends JpaRepository<UsageLog, Long>{
	//List<UsageLog> findByUserIdAndDate(Long userId, LocalDate date);
	List<UsageLog> findByUserId(Long userId);
    List<UsageLog> findByDate(LocalDate date);
}
