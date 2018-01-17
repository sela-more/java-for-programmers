import java.io.IOException;


public class MyThrow {
	public static void main(String args[]){
	     MyThrow my = new MyThrow();
	   }
	   public MyThrow(){
	      catchIt();
	   }

	   public void catchIt(){
	     try
	     {
	       makeCalc(0);
	     }
	     catch(ArithmeticException a)
	     {
	       System.out.println(a);
	     }
	     catch(IOException io)
	     { 
	       System.out.println(io);
	     }
	   }
	   public void makeCalc(int div) throws IOException
	   {
	      divide(div);
	   }
	   // This may throws an IOException:
	   public void divide(int y) throws IOException
	   {
	      int x = System.in.read();
	      System.out.println(x/y);
	   }

}
