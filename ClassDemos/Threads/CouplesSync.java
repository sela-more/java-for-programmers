
public class CouplesSync implements Runnable
{
	   String m_sHe, m_sShe;

	   public CouplesSync(String he, String she)
	   {
	     m_sHe = he;
	     m_sShe = she;
	   }

	   public void run()
	   {
	        while(true)
			printCouple(m_sHe, m_sShe);
	   }

	   static synchronized void printCouple(String He, String She) {
		  System.out.print(He + "&");
		  System.out.print(She + "\n");
	   }
	   public static void main(String args[])
	   {
	      Thread couple1 = new Thread(new CouplesSync("Popeye","Olive"));
	      Thread couple2 = new Thread(new CouplesSync("Kermit","Ms. Piggy"));
	      couple1.start();
	      couple2.start();
	   }

	} // End of class
