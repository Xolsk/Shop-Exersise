package com.shop.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.shop.domain.AbsProduct;


public class StockRepository {
	
	
	private static List<AbsProduct> generalStock=new ArrayList<AbsProduct>();
	
	
	public StockRepository() {}
	
	public void addToStock (AbsProduct element) {
		
		generalStock.add(element);
	}
	
	public String checkStock() {
		
		HashMap<String, Integer> stockbyClass = new HashMap<String,Integer>();
		
		
		for (int i=0;i<generalStock.size();i++) {
			
			
			
		}
		
		return stringedStock;
	}
	
}

