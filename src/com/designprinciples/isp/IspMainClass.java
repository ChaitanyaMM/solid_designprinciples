package com.desginprinciples.isp;

public class IspMainClass {

	public static void main(String[] args) {

		EmployeeManagement em = new EmployeeManagement();

		Employee dev = new Developer(1, "BKC", "DEV");
		em.callUpon(dev);

		Employee tester = new Tester(1, "ROSY", "Tester");
		em.callUpon(tester);

		Employee architet = new Architect(1, "chaitanya", "Architect");
		em.callUpon(architet);

		Employee business = new Business(1, "ROSY", "Business");
		em.callUpon(business);

		Employee finance = new Finance(1, "XYZ", "Finance");
		em.callUpon(finance);

		Employee marketing = new Marketing(1, "ABC", "marketing");
		em.callUpon(marketing);

	}

}
