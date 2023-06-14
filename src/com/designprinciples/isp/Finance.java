package com.designprinciples.isp;

public class Finance extends Employee implements FinanceActions {

	Finance(int id, String name, String role) {
		super(id, name, role);
		System.out.println("");// just for space purpose
		System.out.println("Finance Team in Action");
	}

	@Override
	void doActions() {
		creditSalaries();
	}

	@Override
	public void creditSalaries() {
		System.out.println("creditSalaries");
	}

}
