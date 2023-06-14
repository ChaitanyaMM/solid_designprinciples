package com.designprinciples.ocp;

public class Developer extends Employee {

	Developer(int id, String name, String role) {
		super(id, name, role);
		System.out.println("Developer is in Action");
	}

	// Devoper activities
	public void writeCode() {
		System.out.println("writing code");
	}

	public void debugCode() {
		System.out.println("debug code");

	}

	@Override
	void doActions() {
		writeCode();
		debugCode();

	}

}
