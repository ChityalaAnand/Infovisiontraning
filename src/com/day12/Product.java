package com.day12;

public class Product {
	private String name;
	private double price;
	private int stock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public Product(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
