package com.shop.domain;

public abstract class AbsProduct {
	
	protected  String name;
	private double price;
	private String description;
	
	
	public AbsProduct (String name, double price, String description) throws Exception {
		
		if (name.equals(""))
			throw new Exception();		
		this.name=name;
		this.price=price;
		this.description=description;
	
	}
	
	

}
