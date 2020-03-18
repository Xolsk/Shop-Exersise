package com.shop.domain;

public abstract class AbsShop {
	
	private String name;
	private String adress;
	
	public AbsShop (String name, String adress) throws Exception {
		
		if (name.equals(""))
			throw new Exception();
		if (adress.equals(""))
			throw new Exception();
		this.name=name;
		this.adress=adress;
	
	}	
	
	
}

