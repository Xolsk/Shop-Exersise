package com.shop.domain;

public enum Material {

	PLASTIC("Plastic"),
	WOOD("Wood"),
	IRON("Iron"),
	GOLD("Gold");
	
	private String material;
	
	Material(String string) {
		this.material=string;
	}
	
	public String getMaterial() {
        return material;
    }
}
