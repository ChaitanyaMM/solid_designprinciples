package com.desginprinciples.isp;

public class Architect extends Employee implements ArchitectActions {

	Architect(int id, String name, String role) {
		super(id, name, role);
		System.out.println("");// just for space purpose
		System.out.println("Architect in Action");
	}

	@Override
	void doActions() {
		designArchitecture();
	}

	@Override
	public void designArchitecture() {
		System.out.println("designArchitecture");
	}
}
