package chap06;

public class PrintingThread implements Runnable  {
	CustomersContainer m_container;

	public PrintingThread (CustomersContainer cc) {
		m_container=cc;
		System.out.println("PrintingThread created...\n");

	}

	public void run() {
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(6000);	
				System.out.println(
						"\nCurrent customers\n-----------------");
				m_container.printCustomers();
				System.out.println("");
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}			
		}	
	}


}

