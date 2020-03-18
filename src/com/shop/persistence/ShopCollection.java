package com.shop.persistence;

import java.util.ArrayList;
import java.util.List;

import com.shop.domain.AbsShop;

public class ShopCollection {
	
	private static List<AbsShop> shopCollection =new ArrayList<AbsShop>();
		
	public ShopCollection() {}
	
	public void addShop(AbsShop element) {
		
		shopCollection.add(element);
	}
	

}
