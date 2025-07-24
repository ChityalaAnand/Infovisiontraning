package com.smarttelecom.billing_service.reposistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smarttelecom.billing_service.entity.Bill;

public interface BillingRepository extends JpaRepository<Bill, Long> {
    List<Bill> findByUserId(Long userId);
}