package com.designprinciples.isp;

public class Tester extends Employee implements TesterActions {

	Tester(int id, String name, String role) {
		super(id, name, role);

		System.out.println("");// just for space purpose
		System.out.println("Tester in Action");
	}

	@Override
	public void testCode() {
		System.out.println("testCode");
	}

	@Override
	void doActions() {
		testCode();
	}

}
