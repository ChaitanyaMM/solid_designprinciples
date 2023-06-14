package com.designprinciples.srp.violation;



/** here we have SRP violation 
 a class must have to be changes for one resone that means there are different type of employee
and for increse in salry request coming from different actions (Employee types) for that every 
time we need  to change the percentage in employee class for different roles
**/


public class Employee {

	public int id;
	public String name;
	public double salaryPerMonth;
	public String role;

	Employee(int id, String name, double salaryPerMonth, String role) {
		this.id = id;
		this.name = name;
		this.salaryPerMonth = salaryPerMonth;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}

	public String getRole() {
		return role;
	}

	public int getIncresedSalary() {
		double incresed = this.getSalaryPerMonth() + (this.getSalaryPerMonth() * 40.00 / 100);
		return (int) incresed;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaryPerMonth=" + salaryPerMonth + ", role=" + role + "]";
	}

}
