
public class MyException {
	public static void main(String args[])
	   {
	     int m_array[] = {12,13,14};
	     for (int i=0;i<=m_array.length;i++){
	       try {
	         System.out.println("i= "+ i +" m_nArray[i]= " + m_array[i]+
	         		"m_nArray[i]/i= " + m_array[i]/i);
	      }
	      catch(ArithmeticException  | NullPointerException a){
	        System.out.println(a);
	      }
	       catch(ArrayIndexOutOfBoundsException e){
	        System.out.println(e);
	      }
	      System.out.println("iteration number " + (i+1));
	    }
	    System.out.println("just got out");
	  } 

}
