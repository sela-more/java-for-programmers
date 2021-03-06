package MessageBx;

public class Printer implements Runnable {
	int counter=0;
	boolean isJerry=false;
	MessageBox myBox;

	public Printer(MessageBox _BoxRef, boolean _IsJerry) {
		isJerry = _IsJerry;
		myBox = _BoxRef;
	}

	// Print the character
	public void run() {
		while(counter++<100) {
			if (isJerry)
				myBox.printJerry();
			else
				myBox.printGeorge();
		} 
	}
} 
