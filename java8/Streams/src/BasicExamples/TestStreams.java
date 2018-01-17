package BasicExamples;

import java.util.ArrayList;
import java.util.Collection;

public class TestStreams {

	
		public static void main(String[] args) {
			Collection<String> strings = new ArrayList<>();
			strings.add("moshe");
			strings.add("shamy");
			strings.add("java");
			// 1. Collection
			//strings.forEach(s -> System.out.println(s));
			// 2. Stream
			//strings.stream().forEach(s -> System.out.println(s));
			// 3. Parallel Stream
			//strings.parallelStream().forEach(s -> System.out.println(s));
		}
	
}
