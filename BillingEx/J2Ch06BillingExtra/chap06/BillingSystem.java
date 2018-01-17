package chap06;

public class BillingSystem {
	public static void main(String []args) {

		System.out.println("Welcome to our billing system");
		CustomersContainer cc = new CustomersContainer();

		AddingThread ad = new AddingThread(cc);
		ad.start();

		PrintingThread pd = new PrintingThread(cc);
		Thread pdt = new Thread(pd);
		pdt.start();
	}	
}	
