package MultiCopier;

import java.io.*;

public class Main implements UI {
	static BufferedReader m_Reader;
	static {
		m_Reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public String readLine() {
		String sRetVal = null;
		try {
			sRetVal = m_Reader.readLine();
		} catch (Exception e) {
			System.err.println(e);
		}
		return sRetVal;
	}

	public void doJob() {
		String sSource = null, sDestination = null;
		System.out.println("enter source file");
		sSource = readLine();
		System.out.println("Enter destination");
		sDestination = readLine();
		// Create a dedicated copier thread:
		Thread c = new Thread(new Copy(sSource, sDestination, this));
		
		c.start();
	}

	public void printLine(String s) {
		System.out.println(s);
	}

	public static void main(String args[]) {
			
		
		Main m = new Main();
		while (true)
			m.doJob();
	}
	
}

