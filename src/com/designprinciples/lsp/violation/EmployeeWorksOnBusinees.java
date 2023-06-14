package com.designprinciples.lsp.violation;

public class EmployeeWorksOnBusinees extends Employee {

	private String designation;

	public void setSalarieis(String salarieis) {
		// not related
	}

	public void setArchitecture(String architecture) {
		// not related
	}

	public void setBusinees(String businees) {
		if (businees.equalsIgnoreCase("international")) {
			this.designation = "MarketingManager";

		} else if (businees.equalsIgnoreCase("national")) {
			this.designation = "BusinessAnalyst";

		}
		
	}

	public void setCoding(String coding) {
		// not related
		
	}

	public String getDesignation() {
		return designation;
	}


}
