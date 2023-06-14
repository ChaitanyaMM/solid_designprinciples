package com.designprinciples.lsp.violation;

public enum Role {

	DEVELOPER("DEV"),
	ARCHITECT("ARCH"),
	BUSINESS("BUSINEES"),
	FINANCE("FINANCE");

	private String role;

	Role(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

}
