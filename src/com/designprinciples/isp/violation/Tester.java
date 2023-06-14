package com.designprinciples.isp.violation;

public class Tester extends Employee implements EmployeeActions {

	Tester(int id, String name, String role) {
		super(id, name, role);

		System.out.println("");//just for space purpose
		System.out.println("Tester in Action");
	}

	@Override
	public void bringBusiness() {
		System.out.println("bringBusiness");
	}

	@Override
	public void writeCode() {
		System.out.println("writeCode");
	}

	@Override
	public void testCode() {
		System.out.println("testCode");
	}

	@Override
	public void creditSalaries() {
		System.out.println("creditSalaries");
	}

	@Override
	public void designArchitecture() {
		System.out.println("designArchitecture");

	}

	@Override
	public void sellProduct() {
		System.out.println("sellProduct");
	}

	@Override
	void doActions() {
		bringBusiness();

		writeCode();

		testCode();

		creditSalaries();

		designArchitecture();

		sellProduct();

	}

}
