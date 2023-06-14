package com.designprinciples.srp;

public class Employee {

	public int id;
	public String name;
	public double salaryPerMonth;
	public Role role;

	Employee(int id, String name, double salaryPerMonth, Role role) {
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

	public Role getRole() {
		return role;
	}

	public int getIncresedSalary() {
		return (int)role.getCalculator().calculate(this);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaryPerMonth=" + salaryPerMonth + ", role=" + role + "]";
	}

}
