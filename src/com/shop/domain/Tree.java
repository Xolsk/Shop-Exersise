package com.shop.domain;

public class Tree extends AbsProduct {

	private String especie;
	private double height;
	private static String name="Tree";
	public Tree( double price, String description,String especie, double height) throws Exception {
		
		
		super (name,price,description);
		this.especie=especie;
		this.height=height;
	}

}
