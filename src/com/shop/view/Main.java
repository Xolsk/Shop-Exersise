package com.shop.view;

import com.shop.application.ShopController;

public class Main {
	
	static ShopController controller= new ShopController();

	public static void main(String[] args) throws Exception {
		
		
		controller.createShop("La tienda de Pepi", "13 Rue del Percebe");
		controller.addFlower(23, "Preciosa rosa roja intenso", "Rosa rosae", "rojo");
		controller.addFlower(18, "Preciosa petunia ", "Petunium Closum", "rosa");
		controller.addFlower(12, "Aromatica flor", "Florum Silvestris", "blanco");
		controller.addTree(45, 180, "Arbol pequeño y discreto", "Pinus enanus");
		controller.addTree(44, 480, "Majestuoso y molon", "Sequoia Arboreini");
		controller.addDeco(12, "Lampara antigua", "Lampara", "Gold");
		System.out.println(controller.checkStock());
		
		
		
	
	}

}
