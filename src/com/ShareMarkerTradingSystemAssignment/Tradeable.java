package com.ShareMarkerTradingSystemAssignment;

public interface Tradeable {
	public void buyStock(String stockId, int quantity) throws Exception;
	public void sellStock(String stockId, int quantity)throws Exception;
}
