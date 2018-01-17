import java.net.*;
import java.io.*;
public class BillingClient {
	Socket m_client;
	
	public BillingClient(int port) throws IOException {
		m_client = new Socket("localhost", port);
	}
	
	public void communicate() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream (m_client.getInputStream());
		CustomersContainer cc = (CustomersContainer)ois.readObject();
		cc.printCustomers();
		ois.close();
	}
	public static void main(String[] args) {
		try {
			BillingClient bc = new BillingClient(5100);
			bc.communicate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
