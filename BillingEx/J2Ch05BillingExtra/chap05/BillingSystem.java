package chap05;


import java.util.Collection;

import chap05.billing.*;
import chap05.exceptions.AssociateRegistryException;

public class BillingSystem {
	public static void main(String []args) {

		try {
			System.out.println("Welcome to our billing system");
			Customer george = new RegCustomer("George");
			Customer jerry = new RegCustomer("Jerry", 10);
			Customer cosmo = new VipCustomer("Cosmo", 20);

			BillingEntity guy = new RegCustomer("Guy", 4000);
			BillingEntity hila = new RegCustomer("Hila", 6000);
			BillingEntity eric = new VipCustomer("Eric", 4000);

//			System.out.println(george.getCustomerCurrentBill());
			jerry.addAssociate(george);
			System.out.println(george.getCurrentBill());
			System.out.println(george.getCustomerCurrentBill());
//			cosmo.addAssociate(guy);
//			cosmo.addAssociate(hila);
			cosmo.addAssociate(eric);
			
			Collection<BillingEntity> associates = 
				cosmo.getAssociates();
			for (BillingEntity be : associates) {
				System.out.println(be);
			}
		} catch (AssociateRegistryException e) {
			RegCustomer rc = e.getAssociate();
			if (rc.getCurrentBill() > 5000) {
				System.out.println(rc.getName() + " entitled to VIP");
			} else {
				System.out.println(rc.getName() + " NOT entitled to VIP");
			}
//			e.printStackTrace();
		}
	}	

}	
