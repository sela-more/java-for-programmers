package OverridingObjectMethodsDemo.toString;

public class Course {
	  String m_name;
	  String m_desc;  
	  public Course(String name, String desc)
	  {
	     m_name = name;
	     m_desc= desc;
	  }
	  public String getName()
	  {
	     return m_name;
	  }
	  public String getDesc()
	  {
	     return m_desc;
	  }  
	  public String toString()  {
	    return m_name + 
		" course " + m_desc;
	  }
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	
	


}
