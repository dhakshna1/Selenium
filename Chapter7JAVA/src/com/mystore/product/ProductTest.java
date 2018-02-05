package com.mystore.product;

public class ProductTest {

	public static void main(String[] args) {
		Product iPhone = new Product();
		Product desktop = new Product();
		iPhone.name="iPhone";
		iPhone.price=399.0;
		iPhone.skuID="Phone1";
		System.out.println(iPhone.name);
		System.out.println(iPhone.price);
		System.out.println(iPhone.skuID);
		
		desktop=iPhone;
		
		desktop.name="Desktop";
		desktop.price=356.50;
		desktop.skuID="Desktop1";
		
		System.out.println(desktop.name);
		System.out.println(desktop.price);
		System.out.println(desktop.skuID);
		
		System.out.println(iPhone.name);
		System.out.println(iPhone.price);
		System.out.println(iPhone.skuID);
		
	//	iPhone.purchase(3);
	//	desktop.purchase(5);
		
	//	System.out.println(iPhone.calculatePrice(10));
	//	System.out.println(desktop.calculatePrice(5));

	}

}
