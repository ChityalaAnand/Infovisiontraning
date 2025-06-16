package com.day4.telecomprojectexception;

public class TelecomService {
	public void recharge(String mobileNumber) throws InvalidMobileNumberException {
		if(mobileNumber.length()<10) {
			throw new InvalidMobileNumberException("Mobile number should have 10 digits");
		}else if(!(mobileNumber.startsWith("9") || mobileNumber.startsWith("7") || mobileNumber.startsWith("8") || mobileNumber.startsWith("6"))) {
			throw new InvalidMobileNumberException("Invalid mobile number");
		}
	}
	
	public void checkRechargeAmount(long enteredAmount) throws InvalidRechargeAmountException {
		if(enteredAmount < 0) {
			throw new InvalidRechargeAmountException("Amount must be greater than zero");
		}else {
			System.out.println("Please select any one of the plan 349 or 640 or 1249");
		}
	}
	
	public void checkRechargeValidPlans(long rechargePlan) throws RechargeServiceUnavailableException{
		if(!(rechargePlan == 349 || rechargePlan == 640 || rechargePlan == 1249)) {
			throw new RechargeServiceUnavailableException("Recharge plan not available please select available recharge plan");
		}else {
			System.out.println("Rechange Successfully Completed");
		}
	}
}
