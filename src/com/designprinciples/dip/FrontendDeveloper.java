package com.designprinciples.dip;

public class FrontendDeveloper implements Developer {

	public void canWriteInJavaScript() {
		System.out.println("codes in JavaScript ");
	}

	public void canWriteInAngular() {
		System.out.println("codes in Angular ");
	}

	@Override
	public void develop() {
		System.out.println(" ");
		System.out.println("FrontEnd devs are in Action  ");
		canWriteInJavaScript();
		canWriteInAngular();
	}


}
