package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashToTree {
	Set m_hashSet;
	  Set m_treeSet;
	 
	  public static void main(String args[]) {
		  HashToTree sets = new HashToTree();
	  }
	 
	  public HashToTree() {
	     fillTheSet();
	     printSet(m_hashSet);
	     hashToTree(m_hashSet);
	     printSet(m_treeSet);
	  }
	  public void fillTheSet(){
		    m_hashSet = new HashSet(); // Create a new collection
		    m_hashSet.add("zzz");
		    m_hashSet.add("aaa");
		    m_hashSet.add("bbb");
		    m_hashSet.add("mmm");    
		  }

		  public void printSet(Set set){
		    System.out.println(set);
		  }
		  public void hashToTree(Set set){
			  m_treeSet = new TreeSet(set);
		  }
		


}
