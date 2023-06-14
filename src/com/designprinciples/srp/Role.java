package com.designprinciples.srp;

public enum Role {

	DEVELOPER(new DeveloperPercentageCalculator()), 
	ARCHITECT(new ArchitectPercentageCalculator()),
	TESTER(new TesterPercentageCalculator());

	private PercentageCalculator calculator;

	Role(PercentageCalculator calculator) {
		this.calculator = calculator;
	}

	public PercentageCalculator getCalculator() {
		return calculator;
	}

}
