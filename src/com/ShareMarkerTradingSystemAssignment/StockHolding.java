package com.ShareMarkerTradingSystemAssignment;

public class StockHolding {
    private Stock stock;
    private int quantity;
  
    public StockHolding(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
