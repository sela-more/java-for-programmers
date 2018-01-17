import java.util.*;
import java.io.*;
import billing.*;

public class CustomersContainer {
	TreeSet customers = new TreeSet(new CustomerByNameComp());
	
	public void addCustomer(Customer c) throws CustomerException {
		if (!customers.add(c)) {
			throw new CustomerException(c);
		}
		else {
			System.out.println("Customer added: " + c);
		}
	}
	
	public void printCustomers() {
		Iterator itr = customers.iterator();
		Customer temp;
		int counter=0;
		
		while (itr.hasNext()) {
			temp=(Customer)itr.next();
			System.out.println(counter++ + ") " + temp);
		}
	}
	
	public void saveCustomers(File fileName) throws IOException{
		FileOutputStream fos = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(customers);
		oos.close();
		System.out.println("Customers saved to "+fileName.getAbsolutePath());
	}
	
	public void readCustomers(File fileName) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		customers = (TreeSet)ois.readObject();
		System.out.println("Customers retrieved from "+fileName.getAbsolutePath());

	}
}
