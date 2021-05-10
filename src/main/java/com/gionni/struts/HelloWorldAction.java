package com.gionni.struts;


public class HelloWorldAction {
	
	public String execute() {
		System.out.println("Valor digitado no formulário foi: " + firstName);
		return "success";
	}
	
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

}
