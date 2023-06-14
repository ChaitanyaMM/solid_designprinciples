package com.designprinciples.dip;

public class Project {

	public static void callUponDevTeams(Developer developer) {
		developer.develop();
	}

	public static void main(String[] args) {
		
		callUponDevTeams(new BackendDeveloper()); 
		callUponDevTeams(new FrontendDeveloper()); 


	}

}
