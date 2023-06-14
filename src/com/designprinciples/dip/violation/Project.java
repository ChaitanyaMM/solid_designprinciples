package com.designprinciples.dip.violation;

public class Project {

	public static void main(String[] args) {

		BackendDeveloper backend = new BackendDeveloper();

		FrontendDeveloper frontend = new FrontendDeveloper();

		backend.canWriteInJava();
		backend.canWriteInPython();
		
		System.out.println("");
		
		frontend.canWriteInAngular();
		frontend.canWriteInJavaScript();

	}

}
