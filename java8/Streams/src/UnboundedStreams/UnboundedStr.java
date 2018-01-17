package UnboundedStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class UnboundedStr {
	public static void main(String[] args)   {
		Stream<String> s = Stream.generate(()->getInputFromUser());
		s.forEach((t)->System.out.println(t));
	}

	private static String getInputFromUser(){
		String result = null;

		try {
			result = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read from console!");
			return null;
		}
		return result;
	}


}
