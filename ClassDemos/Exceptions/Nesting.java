import java.io.IOException;


public class Nesting {
	public static void main(String args[])
	  {
	    try
	    {
	      try
	      {
	        int y=9; 
	        // notice you get ascii code from read 
	        int x = System.in.read();
	        System.out.println(x/y);
	      }
	      catch(ArithmeticException math)
	      { }
	      
	     System.out.println("after arithmetic exception");
	    }
	    catch(IOException e)
	    {
	      System.out.println(e);
	    }
	  }

}
