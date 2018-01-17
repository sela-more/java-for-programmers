package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookInSetExample implements Comparable {
	
	String m_name;
	String m_ISBN;
	
	public String getISBN() {return m_ISBN;} 
	
	
	public BookInSetExample(String name, String ISBN) {
		m_name=name;
		m_ISBN = ISBN;
	}
	
	public boolean equals(Object second) {
		if (second instanceof BookInSetExample) {
			BookInSetExample temp = (BookInSetExample)second;
			return this.m_name.equals(temp.m_name);
		}
		else
			return false;
	}
	
	public int hashCode() {
		return m_name.hashCode()+m_ISBN.hashCode();
	}

	public int compareTo(Object second) {
		BookInSetExample temp = (BookInSetExample)second;
			
		return (this.m_name.compareTo(temp.m_name));
	}
	
	
	public static void main(String[] args) {
		Set hs = new HashSet();
		BookInSetExample a = new BookInSetExample("Harry Potter","123123");
		BookInSetExample b = new BookInSetExample("Jungle Book", "12235");
		BookInSetExample c = new BookInSetExample("LOTR", "2332");
		BookInSetExample d = new BookInSetExample("Harry Potter","123123");

		
		
		System.out.println(hs.add(a));
		System.out.println(hs.add(b));
		System.out.println(hs.add(c));
		System.out.println(hs.add(d));
		
		BookInSetExample temp;
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			temp = (BookInSetExample)itr.next();
			System.out.println(temp.m_name + " , ISBN=" + temp.m_ISBN);
		}
		
		
		TreeSet ts = new TreeSet();
		System.out.println(ts.add(a));
		System.out.println(ts.add(b));
		System.out.println(ts.add(c));
		System.out.println(ts.add(d));
		
		Iterator itr2 = ts.iterator();
		while (itr2.hasNext()) {
			temp = (BookInSetExample)itr2.next();
			System.out.println(temp.m_name + " , ISBN=" + temp.m_ISBN);
		}
		
		TreeSet ts2 = new TreeSet(new BookByIsbnComp());
		System.out.println(ts2.add(a));
		System.out.println(ts2.add(b));
		System.out.println(ts2.add(c));
		System.out.println(ts2.add(d));
	
		Iterator itr3 = ts2.iterator();
		while (itr3.hasNext()) {
			temp = (BookInSetExample)itr3.next();
			System.out.println(temp.m_name + " , ISBN=" + temp.m_ISBN);
		}
		
		  hs  = Collections.unmodifiableSet(hs);
			hs.clear();
	
	}

}
