package Exercises;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FancyBag {
	
	
	public static void main(String[] args) {
		Stream<Integer> s = 
				Stream.of(12,4,67,32,12,4,121,345,80,12,1111,10);
		
		
		// Create a map where the value is a list of elements with the same value as key
		Map<Integer, List<Integer> > bag = 
				s.collect(Collectors.groupingBy(e->e));
		
		// reduce the map to a map where the value is the number of elements with key
		Map<Integer,Integer> newBag = new TreeMap<Integer,Integer>();
		
		
		bag.forEach((key,value)->{newBag.put(key, value.size());});
		
		//test - print the  bag
		newBag.forEach((key,value)->{System.out.println("["+ key + ", " + value+ "]");});
		
		// calculating the average of a bag:
		// each entry is a value + the number of times it appears. 
		// Average is sum(entry * times) / sum(values)
		
		
		
		double avg = ((newBag.entrySet().stream().mapToInt(entry->(int) (entry.getKey() * entry.getValue()))).sum() 
		/
		((newBag.values().stream().mapToInt(val->(int) val)).sum() * 1.0));
		
		
		System.out.println("Bag average is : " + avg);
	}

}
