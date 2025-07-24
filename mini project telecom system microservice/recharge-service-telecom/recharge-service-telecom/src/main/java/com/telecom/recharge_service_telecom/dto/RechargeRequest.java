package com.telecom.recharge_service_telecom.dto;

public class RechargeRequest {
	private Long customerId;
    private Long planId;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
}
