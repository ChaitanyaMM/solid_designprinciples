package com.designprinciples.isp;

public class Developer extends Employee implements DevActions {

	Developer(int id, String name, String role) {
		super(id, name, role);
		System.out.println("");// just for space purpose
		System.out.println("Dev in Action");
	}

	@Override
	void doActions() {
		writeCode();
	}

	@Override
	public void writeCode() {
		System.out.println("writeCode");
	}

}
