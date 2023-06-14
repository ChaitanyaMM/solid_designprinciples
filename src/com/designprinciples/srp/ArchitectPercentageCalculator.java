package com.designprinciples.srp;

public class ArchitectPercentageCalculator implements PercentageCalculator {

	@Override
	public double calculate(Employee employee) {
		return employee.getSalaryPerMonth() + (employee.getSalaryPerMonth() * 20.00/100);
	}

}
