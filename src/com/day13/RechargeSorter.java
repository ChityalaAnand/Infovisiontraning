package com.day13;

public class RechargeSorter {
	public static void main(String[] args) {
		RechargeRecord[] rechargeData = { new RechargeRecord("9123456780", "2025-06-20", 199.0),
									 new RechargeRecord("9123456781", "2025-06-22", 99.0),
									 new RechargeRecord("9123456782", "2025-06-18", 499.0),
									 new RechargeRecord("9123456783", "2025-06-21", 249.0) };

		for (int i = 0; i < rechargeData.length; i++) {
			for (int j = 0; j < rechargeData.length - 1; j++) {
				if (rechargeData[j].amount > rechargeData[j + 1].amount) {
					RechargeRecord temp = rechargeData[j];
					rechargeData[j] = rechargeData[j + 1];
					rechargeData[j + 1] = temp;
				}
			}
		}
		for (RechargeRecord recharge : rechargeData) {
			System.out.println(recharge);
		}
	}
}
