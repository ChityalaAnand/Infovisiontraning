package com.ShareMarkerTradingSystemAssignment;
import java.util.HashMap;
import java.util.Map;

public class Market {
    private Map<String, Stock> stocks = new HashMap<>();

    public synchronized void addStock(Stock stock) {
        stocks.put(stock.getStockId(), stock);
    }

    public synchronized Stock getStock(String stockId) throws StockNotFoundException {
        Stock stock = stocks.get(stockId);
        if (stock == null) {
            throw new StockNotFoundException("Stock ID " + stockId + " not found in market.");
        }
        return stock;
    }
}
