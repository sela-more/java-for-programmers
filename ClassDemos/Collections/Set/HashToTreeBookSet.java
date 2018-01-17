package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashToTreeBookSet {
	Set m_hashSet, m_treeSet;
	  public static void main(String args[])  {
		  HashToTreeBookSet bookSet = new HashToTreeBookSet(); 
	  }
	 
	  public HashToTreeBookSet()
	  {
	     fillTheSet();
	     System.out.println("Printing the hash set");
	     printSet(m_hashSet);
	     hashToTree(m_hashSet);
	     System.out.println("Printing the tree set");
	     printSet(m_treeSet);
	     testConsistency();     
	  }
	  public void fillTheSet()
	  {
	    m_hashSet = new HashSet(); // Create New Collection
	    for (int i=0;i<10;i++) {
	       m_hashSet.add(new BookInSetExample("name: " + i, "isbn"+i));          
	    }
	  }
	 
	  public void printSet(Set set)
	  {    
	   Iterator it = set.iterator();
	   while(it.hasNext())
	   System.out.println("Book number: "+
	      ((BookInSetExample)it.next()).getISBN());
	  }
	//Convert a Hashet to a Treeset
	 public void hashToTree(Set set) { 
	     m_treeSet = new TreeSet(set); 
	 }
	 public void testConsistency() 
	 {
		 BookInSetExample b1 = new BookInSetExample("SameName","SameISBN"); 
		 BookInSetExample b2 = new BookInSetExample("SameName","SameISBN");
	     if ((b1.compareTo(b2)==0) && (b1.equals(b2)))
	        System.out.println("Objects are the same");
	 }

}
