package com.ShareMarkerTradingSystemAssignment;

public class ShareMarketTradingSystem {
	public static void main(String[] args) {

		Market market = new Market();
		market.addStock(new Stock("AAPL", "Apple Inc.", 150.0, 100));
		market.addStock(new Stock("TSLA", "Tesla Inc.", 700.0, 50));
		market.addStock(new Stock("INFY", "Infosys Ltd.", 1200.0, 80));

		Trader anand = new Trader("T001", "Anand", market);
		Trader venky = new Trader("T002", "Venky", market);
		Trader pavan = new Trader("T003", "Pavan", market);

		Thread t1 = new Thread(anand);
		Thread t2 = new Thread(venky);
		Thread t3 = new Thread(pavan);

		t1.start();
		t2.start(); 
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		anand.printPortfolio();
		venky.printPortfolio();
		pavan.printPortfolio();

	}

}
