package com.designprinciples.srp;

public class TesterPercentageCalculator implements PercentageCalculator {

	@Override
	public double calculate(Employee employee) {
		return employee.getSalaryPerMonth() + (employee.getSalaryPerMonth() * 30.00/100);
	}


}
