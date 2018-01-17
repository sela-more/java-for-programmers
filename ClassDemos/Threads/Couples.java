
public class Couples extends Thread
{
	   String m_sHe, m_sShe;
	   int m_nTime;
	   public static void main(String args[])
	   {
	      Couples couple1 = new Couples("Popeye","Olive",500);
	      Couples couple2 = new Couples("Kermit","Ms. Piggy",200);
	      Couples couple3 = new Couples("Mickey","Minnie",1000);
	      couple1.start();
	      couple2.start();
	      couple3.start();      
	   }   
	   public Couples(String he, String she, int time)
	   {
	     m_sHe 	= he;
	     m_sShe 	= she;
	     m_nTime	= time;
	   }   

	   public void run()
	   {
	      try
	      {
	        while(true)
	        {
	          System.out.print(m_sHe + "&");
	          sleep(m_nTime);  // Sleep zzz… 
	          System.out.print(m_sShe + "\n");
	        }
	      }
	      catch(InterruptedException e)
	      {
	         System.out.println(e);
	      }
	   }
	}
