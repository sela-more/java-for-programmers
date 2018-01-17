package Exercises;

import java.util.OptionalInt;
import java.util.stream.Stream;

public class NumberWithHighestSquare {
	
	public static void main(String[] args) {
		Stream<Integer> s = 
				Stream.of(12,4,67,32,121,345,80,12,1111,10);
		OptionalInt largest = s.mapToInt(n -> n*n).max();
			
		System.out.println(largest);

	}

}
