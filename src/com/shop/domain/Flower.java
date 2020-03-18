package com.shop.domain;

public class Flower extends AbsProduct {

	private String especie;
	private String color;
	private static String name="Flower";
	
	public Flower(double price, String description, String especie, String color) throws Exception {
		super(name,price, description);
		this.especie = especie;
		this.color = color;
	}

}
