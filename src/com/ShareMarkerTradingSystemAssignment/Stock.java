package com.ShareMarkerTradingSystemAssignment;

public class Stock {
	private String stockId;
	private String stockName;
	private double pricePerShare;
	private int availableShares;
	
	public Stock(String stockId, String stockName, double pricePerShare, int availableShares) {
		this.stockId = stockId;
		this.stockName = stockName;
		this.pricePerShare = pricePerShare;
		this.availableShares = availableShares;
	}
	
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	
	public String getStockId() {
		return stockId;
	}
	
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	public String getStockName() {
		return stockName;
	}
	
	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	
	public double getPricePerShare() {
		return pricePerShare;
	}
	
	public void setAvailableShares(int availableShares) {
		this.availableShares = availableShares;
	}
	
	public synchronized int getAvailableShares() {
		return availableShares;
	}
	
	public synchronized void updateShares(int delta) throws InsufficientMarketSharesException {
		if(availableShares + delta < 0) {
			throw new InsufficientMarketSharesException("Not enough shares in market for " + stockName);
		}
		availableShares += delta;
	}
}
