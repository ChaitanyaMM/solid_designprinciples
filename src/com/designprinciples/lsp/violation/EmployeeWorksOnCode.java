package com.designprinciples.lsp.violation;

public class EmployeeWorksOnCode extends Employee {

	private String designation;

	public void setSalarieis(String salarieis) {
		// not related
	}

	public void setArchitecture(String architecture) {
		// not related
	}

	public void setBusinees(String businees) {
		// not related
	}

	public void setCoding(String coding) {

		if (coding.equalsIgnoreCase("java")) {
			this.designation = "JavaDeveloper";

		} else if (coding.equalsIgnoreCase("python")) {
			this.designation = "PythonDeveloper";

		}
	}

	public String getDesignation() {
		return designation;
	}

}
