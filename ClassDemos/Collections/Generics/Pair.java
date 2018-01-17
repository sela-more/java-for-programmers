package Generics;

import java.sql.Date;
import java.util.Collection;
import java.util.LinkedList;

public class Pair  <T extends Comparable<T>>{
	private T first;
	private T second;
	public Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Pair<String> myPair = new Pair("moshe", "shamy");
		myPair.getFirst();
		//Pair<Date> dates = new Pair(new Date(), new Date()); //Date not comparable!
		//Pair p = new Pair("moshe", new Date());
		//Date d = (Date) p.getSecond();
		
		Collection<Integer> c = new LinkedList();
		c.add(5);
		c.add(null);
		
		for (int i : c){
			
		}
		
	}


}
