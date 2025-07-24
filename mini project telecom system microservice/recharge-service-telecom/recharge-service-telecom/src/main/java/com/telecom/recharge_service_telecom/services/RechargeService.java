package com.telecom.recharge_service_telecom.services;
import com.telecom.recharge_service_telecom.dto.RechargeRequest;
import com.telecom.recharge_service_telecom.models.Recharge;

public interface RechargeService {
	Recharge doRecharge(RechargeRequest request);
}
