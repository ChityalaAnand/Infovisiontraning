package com.telecom.recharge_service_telecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.recharge_service_telecom.dto.RechargeRequest;
import com.telecom.recharge_service_telecom.models.Recharge;
import com.telecom.recharge_service_telecom.services.RechargeService;

@RestController
@RequestMapping("/api/recharges")
public class RechargeController {

	@Autowired
	private RechargeService rechargeService;

	@PostMapping
	public Recharge doRecharge(@RequestBody RechargeRequest request) {
		return rechargeService.doRecharge(request);
	}
}