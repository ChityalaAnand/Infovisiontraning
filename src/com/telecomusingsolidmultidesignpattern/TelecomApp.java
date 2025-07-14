package com.telecomusingsolidmultidesignpattern;
import java.util.List;

public class TelecomApp {
    public static void main(String[] args) throws InterruptedException {
        Customer customer1 = new Customer("Anand", "9999999999");
        Customer customer2 = new Customer("Sravan", "8888888888");

        customer1.activatePlan(PlanFactory.createPlan("prepaid"));
        customer2.activatePlan(PlanFactory.createPlan("postpaid"));

        CallManager callManager = CallManager.getInstance();
        callManager.simulateCall(customer1.getPhoneNumber(), customer2.getPhoneNumber(), 5);

        Thread.sleep(6000);

        List<CallLog> logs = callManager.getCallLogs().get(customer1.getPhoneNumber());
        BillingEngine.getInstance().generateBill(customer1, logs);
    }
}
