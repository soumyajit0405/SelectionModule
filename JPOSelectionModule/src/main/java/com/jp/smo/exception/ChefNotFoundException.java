package com.jp.smo.exception;

public class ChefNotFoundException  extends SelectionModuleException {
	
	private String errorMessage;
	
	public ChefNotFoundException(String errorMessage) {
		super(errorMessage);
		this.errorMessage=errorMessage;
		
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	

}
