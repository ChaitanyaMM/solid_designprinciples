package com.designprinciples.srp.violation;

public class EmployeeMainClass {

	public static void main(String[] args) {

		Employee dev = new Employee(1, "chaitanya", 200000.00, "DEVELOPER");

		Employee arch = new Employee(2, "Srikanth", 400000.00, "ARCHITECT");

		Employee tester = new Employee(3, "Mahesh", 100000.00, "TESTER");
		
		
		System.out.println("incresed dev salary :- > "+ dev.getIncresedSalary());
		System.out.println("incresed architect salary :- > "+ arch.getIncresedSalary());
		System.out.println("incresed tester salary :- > "+ tester.getIncresedSalary());

	}

}
