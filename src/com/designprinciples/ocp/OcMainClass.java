package com.designprinciples.ocp;


public class OcMainClass {

	public static void main(String[] args) {

		EmployeeManagement em = new EmployeeManagement();

		Employee dev = new Developer(1, "BKC", "DEV");
		em.callUpon(dev);

		Employee tester = new Tester(1, "ROSY", "Tester");
		em.callUpon(tester);

	}

}
