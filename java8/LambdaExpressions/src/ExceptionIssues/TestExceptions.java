package ExceptionIssues;

import java.io.IOException;
import java.util.function.Function;

public class TestExceptions {
	
	// demonstrating a method that may throw an exception
	public static Integer TestException(String s) throws IOException {
		if (s == null)
			throw new IOException("this is my demo exception");
		return Integer.parseInt(s);
		
	}
	
	public static void demoMethod(Function<String,Integer> f, String s) {
		f.apply(s);
	}

	public static void main(String[] args) {
		Function<String,Integer> f1 ; 
		
		//f1 = TestExceptions::TestException; // problem: unhandled exception!
		
		f1 = (String s) -> {
			try {
				return TestException(s);
			}
			catch (IOException e) {
				throw new RuntimeException(e); 
			}
		};
			

	}

}
