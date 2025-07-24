package com.telecom.recharge_service_telecom.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telecom.recharge_service_telecom.dto.RechargeRequest;
import com.telecom.recharge_service_telecom.models.Customer;
import com.telecom.recharge_service_telecom.models.Plan;
import com.telecom.recharge_service_telecom.models.Recharge;
import com.telecom.recharge_service_telecom.repositories.RechargeRepository;

@Service
public class RechargeServiceImpl implements RechargeService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RechargeRepository rechargeRepository;

	@Override
	public Recharge doRecharge(RechargeRequest request) {

		String customerUrl = "http://CUSTOMER-SERVICE-TELECOM/api/customers/" + request.getCustomerId();
		Customer customer = restTemplate.getForObject(customerUrl, Customer.class);

		String planUrl = "http://PLAN-SERVICE-TELECOM/api/plans/" + request.getPlanId();
		Plan plan = restTemplate.getForObject(planUrl, Plan.class);

		Recharge recharge = new Recharge();
		recharge.setCustomerId(customer.getId());
		recharge.setPlanId(plan.getId());
		recharge.setPlanName(plan.getPlanName());
		recharge.setPrice(plan.getPrice());
		recharge.setRechargeDate(LocalDateTime.now());

		return rechargeRepository.save(recharge);
	}
}