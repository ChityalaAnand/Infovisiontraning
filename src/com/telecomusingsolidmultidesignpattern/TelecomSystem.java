/*
 * package com.telecomusingsolidmultidesignpattern;
 * 
 * import java.util.*; import java.util.concurrent.*; import
 * java.util.concurrent.atomic.AtomicInteger;
 * 
 * // ------------------- Observer Pattern ------------------- interface
 * BillObserver1 { void update(Customer1 Customer1, double amount); }
 * 
 * class CustomerNotifier1 implements BillObserver1 {
 * 
 * @Override public void update(Customer1 customer, double amount) {
 * System.out.println("[NOTIFY] Bill generated for " + customer.getName() +
 * ": Rs. " + amount); } }
 * 
 * // ------------------- Models ------------------- class Customer1 { private
 * final int id; private String name; private Plan plan;
 * 
 * public Customer1(int id, String name) { this.id = id; this.name = name; }
 * 
 * public int getId() { return id; }
 * 
 * public String getName() { return name; }
 * 
 * public Plan getPlan() { return plan; }
 * 
 * public void setPlan(Plan plan) { this.plan = plan; }
 * 
 * public void setName(String name) { this.name = name; } }
 * 
 * abstract class Plan1 { protected double ratePerMinute;
 * 
 * public double getRatePerMinute() { return ratePerMinute; }
 * 
 * public abstract String getType(); }
 * 
 * class PrepaidPlan1 extends Plan1 { public PrepaidPlan1() { this.ratePerMinute
 * = 0.5; }
 * 
 * public String getType() { return "Prepaid"; } }
 * 
 * class PostpaidPlan1 extends Plan1 { public PostpaidPlan1() {
 * this.ratePerMinute = 0.3; }
 * 
 * public String getType() { return "Postpaid"; } }
 * 
 * class CallLog1 { private final Customer1 caller; private final Customer1
 * receiver; private final long startTime; private final long endTime;
 * 
 * public CallLog1(Customer1 caller, Customer1 receiver, long startTime, long
 * endTime) { this.caller = caller; this.receiver = receiver; this.startTime =
 * startTime; this.endTime = endTime; }
 * 
 * public long getDurationInMinutes() { return Math.max(1, (endTime - startTime)
 * / 60000); // at least 1 minute charged }
 * 
 * public Customer1 getCaller() { return caller; }
 * 
 * public Customer1 getReceiver() { return receiver; }
 * 
 * public long getStartTime() { return startTime; }
 * 
 * public long getEndTime() { return endTime; } }
 * 
 * // ------------------- Factory Pattern ------------------- class PlanFactory1
 * { public static Plan1 createPlan(String type) { return
 * switch(type.toLowerCase()){case"prepaid"->new
 * PrepaidPlan1();case"postpaid"->new PostpaidPlan1();default->throw new
 * IllegalArgumentException("Unknown plan type: "+type);}; } }
 * 
 * // ------------------- Singleton Pattern ------------------- class
 * CallManager1 { private static final CallManager1 INSTANCE = new
 * CallManager1(); private final Map<Customer1, List<CallLog>> callLogs = new
 * HashMap<>();
 * 
 * private CallManager1() { }
 * 
 * public static CallManager1 getInstance() { return INSTANCE; }
 * 
 * public synchronized void addCallLog(CallLog log) {
 * callLogs.computeIfAbsent(log.getCaller(), k -> new ArrayList<>()).add(log); }
 * 
 * public Map<Customer1, List<CallLog>> getCallLogs() { return callLogs; }
 * 
 * public List<CallLog1> getCallLogs(Customer1 customer) { return
 * callLogs.getOrDefault(customer, Collections.emptyList()); } }
 * 
 * class BillingEngine1 { private static final BillingEngine1 INSTANCE = new
 * BillingEngine1(); private final List<BillObserver1> observers = new
 * ArrayList<>();
 * 
 * private BillingEngine1() { }
 * 
 * public static BillingEngine1 getInstance() { return INSTANCE; }
 * 
 * public void registerObserver(BillObserver1 observer) {
 * observers.add(observer); }
 * 
 * public double generateBill(Customer1 customer) { List<CallLog1> logs =
 * CallManager1.getInstance().getCallLogs(customer); double total = 0; for
 * (CallLog1 log : logs) { total += log.getDurationInMinutes() *
 * customer.getPlan().getRatePerMinute(); } notifyObservers(customer, total);
 * return total; }
 * 
 * private void notifyObservers(Customer1 customer, double amount) { for
 * (BillObserver1 observer : observers) { observer.update(customer, amount); } }
 * }
 * 
 * // ------------------- SRP: Customer Management ------------------- interface
 * ICustomerService { Customer1 addCustomer(String name, String planType);
 * 
 * void updateCustomer(int id, String name);
 * 
 * void deleteCustomer(int id);
 * 
 * Customer1 getCustomer(int id);
 * 
 * Collection<Customer1> getAllCustomers(); }
 * 
 * class CustomerService1 implements ICustomerService1 { private final
 * Map<Integer, Customer1> customers = new HashMap<>(); private final
 * AtomicInteger idGenerator = new AtomicInteger(1);
 * 
 * public Customer1 addCustomer(String name, String planType) { Customer1
 * customer = new Customer1(idGenerator.getAndIncrement(), name);
 * customer.setPlan(PlanFactory.createPlan(planType));
 * customers.put(customer.getId(), customer); return customer; }
 * 
 * public void updateCustomer(int id, String name) { Customer1 c =
 * customers.get(id); if (c != null) { c.setName(name); } }
 * 
 * public void deleteCustomer(int id) { customers.remove(id); }
 * 
 * public Customer1 getCustomer(int id) { return customers.get(id); }
 * 
 * public Collection<Customer1> getAllCustomers() { return customers.values(); }
 * }
 * 
 * // ------------------- Multithreading: Call Simulation -------------------
 * class CallTask1 implements Runnable { private final Customer1 caller; private
 * final Customer1 receiver; private final int durationInSeconds;
 * 
 * public CallTask1(Customer1 caller, Customer1 receiver, int durationInSeconds)
 * { this.caller = caller; this.receiver = receiver; this.durationInSeconds =
 * durationInSeconds; }
 * 
 * @Override public void run() { long start = System.currentTimeMillis(); try {
 * TimeUnit.SECONDS.sleep(durationInSeconds); } catch (InterruptedException e) {
 * Thread.currentThread().interrupt(); } long end = System.currentTimeMillis();
 * CallLog1 log = new CallLog1(caller, receiver, start, end);
 * CallManager1.getInstance().addCallLog(log);
 * System.out.println("[CALL LOGGED] " + caller.getName() + " -> " +
 * receiver.getName() + " | Duration: " + log.getDurationInMinutes() + " mins");
 * } }
 * 
 * // ------------------- Main Application ------------------- public class
 * TelecomSystem { public static void main(String[] args) throws
 * InterruptedException { Scanner sc=new Scanner(System.in);ICustomerService1
 * customerService=new CustomerService1();BillingEngine1
 * billingEngine=BillingEngine1.getInstance();billingEngine.registerObserver(new
 * CustomerNotifier());
 * 
 * ExecutorService1 executor=Executors.newFixedThreadPool(5);
 * 
 * while(true){System.out.
 * println("\n1. Add Customer\n2. Make Call\n3. Generate Bill\n4. Show All Customers\n5. Exit"
 * );System.out.print("Choose option: ");int choice=sc.nextInt();
 * 
 * switch(choice){case 1->{System.out.print("Enter name: ");String
 * name=sc.next();System.out.print("Enter plan (Prepaid/Postpaid): ");String
 * plan=sc.next();Customer1 c=customerService.addCustomer(name,plan);System.out.
 * println("Added Customer ID: "+c.getId());}case
 * 2->{System.out.print("Caller ID: ");int
 * callerId=sc.nextInt();System.out.print("Receiver ID: ");int
 * receiverId=sc.nextInt();System.out.print("Call duration in seconds: ");int
 * seconds=sc.nextInt();Customer1
 * caller=customerService.getCustomer(callerId);Customer1
 * receiver=customerService.getCustomer(receiverId);if(caller!=null&&receiver!=
 * null){executor.execute(new
 * CallTask1(caller,receiver,seconds));}else{System.out.
 * println("Invalid caller or receiver ID.");}}case
 * 3->{System.out.print("Enter customer ID: ");int id=sc.nextInt();Customer1
 * c=customerService.getCustomer(id);if(c!=null){double
 * bill=billingEngine.generateBill(c);System.out.println("Total bill for "+c.
 * getName()+": Rs. "+bill);}else{System.out.println("Customer not found.");}}
 * case 4->{for(Customer1
 * c:customerService.getAllCustomers()){System.out.println("ID: "+c.getId()
 * +", Name: "+c.getName()+", Plan: "+c.getPlan().getType());}}case
 * 5->{executor.shutdown();executor.awaitTermination(10,TimeUnit.SECONDS);System
 * .out.println("Exiting...");return;}default->System.out.
 * println("Invalid option.");}} } }
 */