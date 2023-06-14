package com.designprinciples.isp;

public class Architect extends Employee implements DevActions {

	Architect(int id, String name, String role) {
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
