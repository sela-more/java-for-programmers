

import java.util.function.Predicate;

public class Calculator {
	
	
	interface IntegerMath {
        int operation(int a, int b);        
    }
    
    interface IntegeredMath {
    	double operation(double a);
    }
  
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
    
    public double operateUnary(double x, IntegeredMath op){
    	return op.operation(x);
	 }

	
	
	public static void main(String args[]) {
		
		    
	        Calculator myApp = new Calculator();
	        IntegerMath addition = (a, b) -> a + b;
	        IntegerMath subtraction = (a, b) -> a - b;
	        IntegeredMath exp = Math::exp;
	        System.out.println("40 + 2 = " +
	            myApp.operateBinary(40, 2, addition));
	        System.out.println("20 - 10 = " +
	            myApp.operateBinary(20, 10, subtraction));    
	        System.out.println("10 * e = " + 
	            myApp.operateUnary(10, exp));
	  }

		
	

}
