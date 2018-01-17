import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadFromUser {
	
	private  int m_firstNum;
	private  int m_secondNum;
	private BufferedReader m_inStream = new BufferedReader(new InputStreamReader(System.in));
	public  int readNum() {
		boolean finish  = false;
		int val = 0;
		
		while (! finish)
		{	String strNum = null;
			System.out.println("Please enter a number");
			try {
				strNum = m_inStream.readLine();
				val= Integer.parseInt(strNum);
				return val;
			} catch (NumberFormatException|IOException e) {
				System.out.println("Could not read the number. Try again");
			}
			
			
		}
		return val;
	}
	public void calcNumbers() {
		m_firstNum = this.readNum();
		m_secondNum = this.readNum();
		double avg =  (m_firstNum + m_secondNum)/2.0;
		System.out.println("The average of: " + m_firstNum + " and: " + m_secondNum + " = "+avg);
	}

	public static void main(String[] args) {
		
		ReadFromUser r = new ReadFromUser();
		r.calcNumbers();
		

	}

}
