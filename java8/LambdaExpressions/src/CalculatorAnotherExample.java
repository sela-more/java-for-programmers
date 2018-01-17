

import java.util.function.Predicate;

public class CalculatorAnotherExample {
	public interface binaryOp {
		public int intOp(int a, int b) ;
		
		
		
	}
	public static  int doMath(binaryOp op, int a, int b) {
		return op.intOp(a,b);
		
	}
	public static <T> boolean doPred(Predicate<T> pred, T val){
		return pred.test(val);
	}
	
	public static void main(String args[]) {
		
		Predicate<Integer> pred = (a-> a>5); 
		System.out.println("using predicate on 3 " +doPred (pred,3));
		System.out.println("using predicate on 3 using pred.test" +pred.test(3));
		
		int outerVar = 5; // outerVar is effectively final. One can not change it
		                  // it its used in a Lambda Expression
	//	outerVar++;
		
		for (int i=0; i < 3; i++) {
		
			binaryOp addition = (a,b)->(a+b+outerVar);
		
			System.out.println("Adding 5 and 7 yeilds: " +doMath (addition,5,7));
			
		}
		
	}

}
