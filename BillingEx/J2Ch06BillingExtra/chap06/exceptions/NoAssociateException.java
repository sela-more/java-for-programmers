package chap06.exceptions;

import chap06.billing.BillingEntity;

public class NoAssociateException extends RuntimeException {

	private static final String BUILTIN_MESSAGE
		= "No associate data exists for this entity."; 
	
	public NoAssociateException() {
		this(BUILTIN_MESSAGE);
	}

	public NoAssociateException(String arg0) {
		super(arg0);
	}	
	
	public NoAssociateException(BillingEntity be) {
		this(be.getClass() + ": " + be + ": " + BUILTIN_MESSAGE);
	}
}
