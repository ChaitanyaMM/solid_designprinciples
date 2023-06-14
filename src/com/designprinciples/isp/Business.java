package com.designprinciples.isp;

public class Business extends Employee implements BusineesActions {

	Business(int id, String name, String role) {
		super(id, name, role);
		System.out.println("");// just for space purpose
		System.out.println("Business Team in Action");
	}

	@Override
	void doActions() {
		bringBusiness();
	}

	@Override
	public void bringBusiness() {
		System.out.println("bringBusiness");
	}
}
