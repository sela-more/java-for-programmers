import java.net.*;
import java.io.*;

public class BillingServer {
	ServerSocket m_server;
	CustomersContainer m_customers;
	
	public BillingServer(CustomersContainer cc, int port) throws IOException {
		m_server=new ServerSocket(port);
		m_customers=cc;
	}
	
	public void communicate() throws IOException {
		Socket s = m_server.accept();
		System.out.println("New client arrived. Sending customers...");
		ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
		oos.writeObject(m_customers);
		oos.close();
	}
}
