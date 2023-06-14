package com.desiginprinciples.ocp.violation;

public class Tester extends Employee {

	Tester(int id, String name, String role) {
		super(id,name, role);
		System.out.println("Tester is in Action");
	}

}
