package com.desiginprinciples.ocp.violation;


//this class is violation it shold be open for extention and closed for modifications but here 
//if any new employee type comes needs to be changed content in the class



public class EmployeeManagement {

	public void callUpon(Employee employee) {

		if (employee instanceof Developer) {
			writeCode();
			debugCode();

		} else if (employee instanceof Tester) {
			manualTesting();
			automationTesting();
		}
	}

	// Devoper activities
	public void writeCode() {
		System.out.println("writing code");
	}

	public void debugCode() {
		System.out.println("debug code");

	}

	// Tester activities
	public void manualTesting() {
		System.out.println("manualTesting the functionality");

	}

	public void automationTesting() {
		System.out.println("automationTesting the functionality");

	}

}
