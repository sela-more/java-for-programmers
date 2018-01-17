package OverloadFurniture;
import java.util.*;

public class MyChairList {

	
	private ArrayList m_list;
	public static void main(String args[])
	{
	   MyChairList chairList = new MyChairList();     
	}
	    
	public MyChairList()
	{
	   m_list = new ArrayList(); // Create a new collection
	   buildList();
	   changeClubMember();
	}
	public void buildList()
	{
	    for (int i=0;i<5;i++){
	      Chair c = new Chair();
	      m_list.add(c);  // Add a new element     
	    }
	 }

	 public void changeClubMember() {
	    for (int i=0;i<m_list.size();i++){
	                  // Get an element out of the collection:
	    	
	    	//Object obj = m_list.get(i);      
	        //if (obj instanceof Chair){
	    		//Chair c = (Chair)obj;  
	        	Chair c = (Chair)m_list.get(i);       
	        	c.setClubMember(true); // special chair function
	        	System.out.println("club memeber set for chair");
	        }
	    }
	  }



}
