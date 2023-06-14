package com.designprinciples.lsp.violation;


/**
 * 
 * @author chaitanya
 * 
 * 
 *   how it is violated lsp is this calls and subclass methods are not completly derivable
 *   all Kind of employees or Derived classes must be substitutable for their base classes
 *   example coder doesn't have to deal with salaries 
 *   Similarly architects doesn't have to deal with salaries 
 *   Similarly finance team doesn't have to deal with coding 
 *   Similarly business team doesn't have to deal with coding 
 */ 




public class Employee {

	private int id;
	private String name;
	private Role role;
	private String architecture;
	private String businees;
	private String coding;
	private String salarieis;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public String getBusinees() {
		return businees;
	}

	public void setBusinees(String businees) {
		this.businees = businees;
	}

	public String getCoding() {
		return coding;
	}

	public void setCoding(String coding) {
		this.coding = coding;
	}

	public String getSalarieis() {
		return salarieis;
	}

	public void setSalarieis(String salarieis) {
		this.salarieis = salarieis;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", architecture=" + architecture
				+ ", businees=" + businees + ", coding=" + coding + ", salarieis=" + salarieis + "]";
	}

}
