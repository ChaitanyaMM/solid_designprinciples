package com.designprinciples.ocp;

public class Tester extends Employee {

	Tester(int id, String name, String role) {
		super(id, name, role);
		System.out.println("Tester is in Action");
	}

	// Tester activities
	public void manualTesting() {
		System.out.println("manualTesting the functionality");

	}

	public void automationTesting() {
		System.out.println("automationTesting the functionality");

	}

	@Override
	void doActions() {
		manualTesting();
		automationTesting();

	}

}
