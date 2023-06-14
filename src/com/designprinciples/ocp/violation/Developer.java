package com.designprinciples.ocp.violation;

public class Developer extends Employee {

	Developer(int id, String name, String role) {
		super(id, name, role);
		System.out.println("Developer is in Action");
	}

}
