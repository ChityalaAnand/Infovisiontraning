package com.TelecomCustomerManagementSystem;
class Main {
    public static void main(String[] args) {
        TelecomService service = new TelecomService();

        service.addCustomer("C001", "Anand");
        service.addCustomer("C002", "Pavan");

        Customer alice = service.findCustomerById("C001");
        alice.addCall("9876543210", 120);
        alice.subscribeVAS("Caller Tune");

        service.fileComplaint("C001", "Network issue");

        Customer bob = service.findCustomerById("C002");
        bob.addCall("9123456780", 300);
        bob.subscribeVAS("Missed Call Alert");

        service.fileComplaint("C002", "Billing error");

        service.displayAllCustomers();

        service.resolveNextComplaint();
        service.resolveNextComplaint();
        service.resolveNextComplaint();
    }
}
