package MessageBx;

public class MessageBox {
	String fName, lName;

	 public synchronized void printGeorge() {
				fName = "George ";
				lName = "Costanza \n";

				System.out.print(fName);
				System.out.print(lName + "\n");			
	 }

	 public synchronized void printJerry() {
				fName = "Jerry ";
				lName = "Seinfeld \n";

				System.out.print(fName);
				System.out.print(lName + "\n");			
	 }

}
