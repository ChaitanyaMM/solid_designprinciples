package com.designprinciples.lsp;

public class Mainclass {

	public static void main(String[] args) {

		EmployeeWorksOnArchitecture arch = new EmployeeWorksOnArchitecture(1, "chaitanya", Role.ARCHITECT,"architecture");
		EmployeeWorksOnBusinees business = new EmployeeWorksOnBusinees(2, "Goel", Role.BUSINESS, "business");
		EmployeeWorksOnCode coding = new EmployeeWorksOnCode(3, "srikanth", Role.DEVELOPER, "coding");
		EmployeeWorksOnFinance finance = new EmployeeWorksOnFinance(4, "narine", Role.FINANCE, "finance");
		
		System.out.println("employees works on " + arch.getArchitecture());
		System.out.println("employees works on " +business.getBusinees());
		System.out.println("employees works on " +coding.getCoding());
		System.out.println("employees works on " +finance.getSalarieis());
	}

}
