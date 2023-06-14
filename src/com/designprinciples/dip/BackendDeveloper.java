package com.designprinciples.dip;

public class BackendDeveloper implements Developer {

	public void canWriteInJava() {
		System.out.println("codes in java ");
	}

	public void canWriteInPython() {
		System.out.println("codes in Python ");
	}

	@Override
	public void develop() {
		System.out.println(" ");
		System.out.println("Backend devs are in Action  ");
		canWriteInJava();
		canWriteInPython();
	}

}
