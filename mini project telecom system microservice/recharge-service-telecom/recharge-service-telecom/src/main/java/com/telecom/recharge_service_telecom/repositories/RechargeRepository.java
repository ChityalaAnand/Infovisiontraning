package com.telecom.recharge_service_telecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.recharge_service_telecom.models.Recharge;
@Repository
public interface RechargeRepository extends JpaRepository<Recharge, Long> {
    // You can add custom query methods here if needed
}
