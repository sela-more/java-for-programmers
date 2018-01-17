package MessageBx;

public class Main {
	public static void main(String[] args) {
		MessageBox aBox = new MessageBox();

		// Print "Jerry":
		Thread jerry = new Thread(new Printer(aBox, true));  

		// Print "George":
		Thread george = new Thread(new Printer(aBox, false));  

		jerry.start();
		george.start();
		    }
}
