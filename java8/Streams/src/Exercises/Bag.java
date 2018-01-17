package Exercises;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Collectors.Employee;

public class Bag {
	//a bag is a map of values where the value is the number of times that the key appears
	
	public static void main(String[] args) {
		Stream<Integer> s = 
				Stream.of(12,4,67,32,12,4,121,345,80,12,1111,10);
		
		
		
		Map<Integer, List<Integer> > bag = 
				s.collect(Collectors.groupingBy(e->e));
		
		
		Map<Integer,Integer> newBag = new TreeMap<Integer,Integer>();
		
		
		bag.forEach((key,value)->{newBag.put(key, value.size());});
		
		//test 
		newBag.forEach((key,value)->{System.out.println("["+ key + ", " + value+ "]");});
		
		// calculating the average of a bag:
		// each entry is a value + the number of times it appears. 
		// Average is sum(entry * times) / sum(values)
		
		Stream<Integer> valStream = newBag.values().stream();
		int numOfElements = valStream.mapToInt(val->(int) val).sum();
		
		System.out.println("numOfElements is: " + numOfElements);
		
		Stream<Map.Entry<Integer,Integer>> entriesStream = newBag.entrySet().stream();
		int totalSum = entriesStream.mapToInt(entry->(((int)entry.getKey()) * ((int)entry.getValue()))).sum();
		
		System.out.println("totalSum is: " + totalSum);
		
		if (totalSum != 0)
			System.out.println("Average of this bag is: " + (totalSum / (numOfElements * 1.0)));
		
		
	}

}
