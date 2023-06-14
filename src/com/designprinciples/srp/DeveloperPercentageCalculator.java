package com.designprinciples.srp;

public class DeveloperPercentageCalculator implements PercentageCalculator {

	@Override
	public double calculate(Employee employee) {
		return employee.getSalaryPerMonth() + (employee.getSalaryPerMonth() * 40.00/100);
	}

}
