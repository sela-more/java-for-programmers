package Collectors;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
//		Stream<String> stream = Stream.of("moshe", "shamy", "java", "sela");
//		List list= stream.collect(Collectors.toList());
//		list.forEach(s->System.out.println(s));
		
//		Stream<String> stream = Stream.of("moshe", "shamy", "java", "sela");
//		String str = stream.collect(Collectors.joining(" "));
//		System.out.println(str);
		
		Stream<String> stream = Stream.of("moshe", "shamy", "java", 
				"sela");
			TreeSet<String> set= (TreeSet<String>) 	stream.collect(Collectors.toCollection(()-> new 
					TreeSet<String>()));
			set.forEach(s->System.out.println(s));



	}

}
