package com.shop.domain;

public class Decoration extends AbsProduct {

		private String type;
		private Material materialEnum;
		private String material="";
		private static String name="Decoration";
		

		public Decoration ( double price, String description, String type, String material) throws Exception {
			super(name, price, description);
		
			this.type=type;
			for (Material materialEnum: Material.values()) {
				if (material==materialEnum.getMaterial()) {
					this.material=material;
				}
			}
			if (this.material=="") {throw new Exception();};
	}

}
