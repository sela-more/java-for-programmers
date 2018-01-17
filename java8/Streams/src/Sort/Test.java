package Sort;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Stream<Integer> s = 
				Stream.of(12,4,67,32,121,345,80,12,1111,10);
			s.filter(n -> n < 100).distinct().sorted((a,b)-> 
				b - a).limit(5)
				.forEach(x->System.out.println(x));


	}

}
