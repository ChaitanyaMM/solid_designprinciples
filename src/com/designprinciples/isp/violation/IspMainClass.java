package com.designprinciples.isp.violation;

public class IspMainClass {

	public static void main(String[] args) {

		EmployeeManagement em = new EmployeeManagement();

		Employee dev = new Developer(1, "BKC", "DEV");
		em.callUpon(dev);

		Employee tester = new Tester(1, "ROSY", "Tester");
		em.callUpon(tester);

	}

}
