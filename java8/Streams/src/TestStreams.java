

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestStreams {
	
	public static void main(String args[]) {
		
		
		ArrayList<String> sArray = new ArrayList<>();
		
		sArray.add("hi");
		sArray.add("bye");
		sArray.add("aaa");
		sArray.add("hi");
		
		Scanner scan = new Scanner(System.in);
		
		String userString = scan.nextLine();
		
		sArray.stream().forEach((s)->{if (s.compareTo(userString)==0) System.out.println(s);});
		
		for (int i=0; i < 5; i++) {
			System.out.println("Enter a string");
			sArray.add(scan.nextLine());
		}
		
		Stream<String> stringStream = sArray.stream();
		Stream<String> sortedString;
		
		//sortedString = stringStream.map(s->s.toUpperCase());
		//sortedString.forEachOrdered(s->System.out.println(s));
		sortedString = stringStream.sorted((s1,s2)->s1.compareTo(s2));
		
		System.out.println("printing stringStresm");
		//stringStream.forEach(s->System.out.println(s));
		
		System.out.println("printing sortedString");
		sortedString.forEach(s->System.out.println(s));
		
	}

}
