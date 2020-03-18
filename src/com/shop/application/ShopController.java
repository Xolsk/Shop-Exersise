package com.shop.application;

import com.shop.domain.Decoration;
import com.shop.domain.Flower;
import com.shop.domain.FlowerShop;
import com.shop.domain.Tree;
import com.shop.persistence.ShopCollection;
import com.shop.persistence.StockRepository;

public class ShopController {

	
	ShopCollection shopCollection = new ShopCollection();
	StockRepository stock=new StockRepository();
	
	public ShopController() {
	}
		
	public void createShop(String name, String adress) throws Exception {
		
		 FlowerShop flowerShop= new FlowerShop(name,adress);
		 shopCollection.addShop(flowerShop);
	}
	
	public void addTree(double price, double height, String description, String especie) throws Exception{
		
		Tree newTree = new Tree(price, description, especie, height);
		stock.addToStock(newTree);
		
	}
	
	public void addFlower(double price, String description,String especie, String color) throws Exception {
		
		Flower newFlower = new Flower(price,description,especie,color);
		stock.addToStock(newFlower);
	}
	
	public void addDeco(double price, String description,String type,String material) throws Exception {
		
		Decoration newDeco = new Decoration(price, description,  type, material);
	}
	
	public String checkStock() {
		
		
		return stock.checkStock();
	}
	
	
		
	}

