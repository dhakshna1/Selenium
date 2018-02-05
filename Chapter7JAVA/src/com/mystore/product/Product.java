package com.mystore.product;

public class Product {
	public String name;
	public double price;
	public String skuID;
	
	public void purchase(int quantity){
		System.out.println(name + " - In purchase() method for items "+quantity);
	}
	
	public double calculatePrice(int quantity){
		return (quantity*price);
	}
}
