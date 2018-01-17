package StreamCreation;

import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		Stream<String> strings = Stream.of("qqq", "moshe", 
			"shamy", "aaa");
		strings.forEachOrdered((s)->System.out.println(s));
		
	}

}
