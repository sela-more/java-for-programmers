package MultiCopier;

import java.io.*;

public class Copy implements Runnable
{
	  private String m_sSource;
	  private String m_sDestination;
	  private FileInputStream fin;
	  private FileOutputStream fout;
	  private UI m_UI; // someone that supports printLing(string)
	  public Copy(String sSource, String sDestination, UI MyUI){
		m_sSource = sSource;
		m_sDestination = sDestination;
		m_UI = MyUI;
	  }
	  public void run() {
		if (!initStreams())
			return;
		copy();
		m_UI.printLine("job Done!");
	  }
	  private boolean initStreams() {
		   boolean bRetVal = true;
		   try {
		 
			   
			 //File f = new File(m_sSource);
			 //if (!f.exists()) System.out.println("There is a problem here!");
			 //fin = new FileInputStream(f);
			 fin = new FileInputStream(m_sSource);
			 fout = new FileOutputStream(m_sDestination);
		   }
		   catch(Exception e) {
			m_UI.printLine(e.toString());
		 	bRetVal = false;
		   }
		 	return bRetVal;		
	  }

	  private void closeStreams() {
		  try {
			fin.close();
			fout.close();
		  }
		  catch (IOException e) {
		 	m_UI.printLine(e.toString());
		  }

	  }
	  private void copy()
	  {
		   try { 
		 	   int ch;
		   	   while ((ch = fin.read()) != -1)
		 		fout.write(ch);
		 	   closeStreams();
		   }
		   catch (Exception e){
		 	   m_UI.printLine(e.toString());
		   }
	  }
}	// End of class Copy
