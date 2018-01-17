package Scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// set up the Scanner object
		Scanner stdin = new Scanner(System.in);
		
		// have the user input the values for x and y
		System.out.print("Enter a decimal number: ");
		double x = stdin.nextDouble();
		System.out.print("Enter another decimal number: ");
		double y = stdin.nextDouble();

		double squareRootX = Math.sqrt(x);

		System.out.println ("Square root of " + x + " is " + squareRootX);    
	}

}
