package chap05.billing;

/**
 * Current impl. allows for only one customer. I.e. - an associate
 * is associated with 1 and only 1 customer. Also, this customer is
 * set through package code.
 * @author user
 *
 */
public class Associate extends BillingEntity {

	public Associate(String name) {
		super(name);
	}
}
