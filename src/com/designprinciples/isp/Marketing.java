package com.designprinciples.isp;

public class Marketing extends Employee implements MarketingActions {

	Marketing(int id, String name, String role) {
		super(id, name, role);
		System.out.println("");// just for space purpose
		System.out.println("Marketing Team in Action");
	}

	@Override
	void doActions() {
		sellProduct();
	}

	@Override
	public void sellProduct() {
		System.out.println("sellProduct");		
	}

	 
}
