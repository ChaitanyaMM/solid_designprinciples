package com.designprinciples.lsp.violation;

public class EmployeeWorksOnArchitecture extends Employee {

	private String designation;

	public void setSalarieis(String salarieis) {
		// not related
	}

	public void setArchitecture(String architecture) {

		if (architecture.equalsIgnoreCase("solution")) {
			this.designation = "solutionArchitect";

		} else if (architecture.equalsIgnoreCase("enterprise")) {
			this.designation = "EnterpriseArchitect";

		}
	}

	public void setBusinees(String businees) {
		// not related
	}

	public void setCoding(String coding) {
		// not related
	}

	public String getDesignation() {
		return designation;
	}

}
