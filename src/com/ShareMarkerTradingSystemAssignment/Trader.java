package com.ShareMarkerTradingSystemAssignment;
import java.util.ArrayList;
import java.util.List;

public class Trader implements Runnable, Tradeable {
    private String traderId;
    private String name;
    private List<StockHolding> portfolio;
    private Market market;

    public Trader(String traderId, String name, Market market) {
        this.traderId = traderId;
        this.name = name;
        this.market = market;
        this.portfolio = new ArrayList<>();
    }

    public void run() {
        try {
            if (name.equals("Anand")) {
                buyStock("AAPL", 10);
                sellStock("AAPL", 5);
                buyStock("TSLA", 5);
            } else if (name.equals("Venky")) {
                buyStock("AAPL", 20);
                buyStock("TSLA", 10);
                sellStock("TSLA", 5);
            } else if (name.equals("Pavan")) {
                buyStock("INFY", 15);
                sellStock("INFY", 5);
                buyStock("AAPL", 5);
            }
        } catch (Exception e) {
            System.out.println(name + " Error: " + e.getMessage());
        }
    }

    public void buyStock(String stockId, int quantity) throws Exception {
        Stock stock = market.getStock(stockId);
        synchronized (stock) {
            stock.updateShares(-quantity);
        }
        boolean found = false;
        for (StockHolding holding : portfolio) {
            if (holding.getStock().getStockId() == stockId) {
                holding.setQuantity(holding.getQuantity() + quantity);
                found = true;
                break;
            }
        }
        if (!found) {
            portfolio.add(new StockHolding(stock, quantity));
        }
        System.out.println(name + " bought " + quantity + " shares of " + stock.getStockName());
    }

    public void sellStock(String stockId, int quantity) throws Exception {
        Stock stock = market.getStock(stockId);
        for (StockHolding holding : portfolio) {
            if (holding.getStock().getStockId() == stockId) {
                if (holding.getQuantity() < quantity) {
                    throw new InsufficientSharesException("Trader does not own enough shares of " + stock.getStockName());
                }
                holding.setQuantity(holding.getQuantity() - quantity);
                synchronized (stock) {
                    stock.updateShares(quantity);
                }
                System.out.println(name + " sold " + quantity + " shares of " + stock.getStockName());
                return;
            }
        }
        throw new InsufficientSharesException("Trader does not own any shares of " + stock.getStockName());
    }

    public void printPortfolio() {
        System.out.println("Portfolio of " + name + ":");
        for (StockHolding holding : portfolio) {
            System.out.println(holding.getStock().getStockName() + " - " + holding.getQuantity() + " shares");
        }
    }
}
