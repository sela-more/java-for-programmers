package Unmodifiable;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSet {
	public static void main(String args[])
	   {
	     Set<String> set = new HashSet<>();
	     set.add("Pooh");
	     set.add("Rabbit");
	     set.add("Piglet");
	     Set<String> readSet = Collections.unmodifiableSet(set);
	     Set<String> syncSet = Collections.synchronizedSet(set);
	     readSet.add("tiger"); // retun error
	     
	     iterateSet(set);
	   }
	   
	   
	   public static void iterateSet(Set<String> mySet){
		   for (String s : mySet){
			   System.out.println(s);
		   }
	   }

}
