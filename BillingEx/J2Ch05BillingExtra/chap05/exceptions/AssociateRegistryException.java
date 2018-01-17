package chap05.exceptions;

import chap05.billing.RegCustomer;

public class AssociateRegistryException extends RuntimeException {

	private static final String BUILTIN_MESSAGE
		= "Specified entity cannot make for an associate."; 
	private RegCustomer rc;
	
	public AssociateRegistryException(RegCustomer rc) {
		super(rc.getClass() + ": " + rc + ": " + BUILTIN_MESSAGE);
		this.rc = rc;
	}
	
	public RegCustomer getAssociate() {
		return rc;
	}
}
