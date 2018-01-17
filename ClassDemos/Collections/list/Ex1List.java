package list;
/*
	Ex1 Purpose: show the usage of list interface with 
			Linked List and ArrayList, the usage of iterators
			Vs. the usage of get(i), performance issues.
*/


import java.util.List;			
import java.util.LinkedList;		
import java.util.ArrayList;		
import java.util.Iterator;
import java.util.ListIterator;


class Ex1List
{
	
	public static void IterList(List<String> l) 
	{

		for (int i = 0 ; i < 100000 ; ++i )
		{
			l.add("This is a string");
		}
		System.out.println("Start looping using Iteration");
		long lStart = System.currentTimeMillis();
		
		// using iterators Vs. regular get

		Iterator<String> iter = l.iterator();
		while(iter.hasNext())
			iter.next();//returns the object

		long lEnd = System.currentTimeMillis();
		System.out.println(lEnd - lStart);

		System.out.println("Start looping by get");
		lStart = System.currentTimeMillis();
		int nSize = l.size();
		for (int i = 0 ; i < nSize ; ++i)
		{
			l.get(i);
		}
		lEnd = System.currentTimeMillis();
		System.out.println(lEnd - lStart);

	}
	public static void differentAddingMethods(LinkedList<String> l) 
	{

		
		System.out.println("Start adding by using addLast");
		long lStart = System.currentTimeMillis();
		

		for (int i = 0 ; i < 100000 ; ++i )
		{
			l.addLast("This is a string");
		}
			

		long lEnd = System.currentTimeMillis();
		System.out.println(lEnd - lStart);

		
		System.out.println("Start adding last elements using add");
		lStart = System.currentTimeMillis();
		for (int i = 0 ; i < 100000 ; ++i )
		{
			l.add(i,"This is a string");
		}
		
		lEnd = System.currentTimeMillis();
		System.out.println(lEnd - lStart);

	}
	public static void main(String args[]) {
		
		// Show performance problems for add(i) Vs. addLast
		// in linked list.
		LinkedList<String> myll = new LinkedList<String>();
		System.out.println("Using LinkedList");
		differentAddingMethods(myll);

		// Show get Vs. iterator in both implementations of list
		List<String> al = new ArrayList<String>();
		System.out.println("Using ArrayList");
		IterList(al);

		List<String> ll = new LinkedList<String>();
		System.out.println("Using LinkedList");
		IterList(ll);
	}
};