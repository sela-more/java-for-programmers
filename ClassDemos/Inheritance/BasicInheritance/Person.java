package BasicInheritance;
/* demonstrated the usage of Object basic methods, like equals and toString 
*/
class Person //extensds Object
{
	String m_sName;

	Person(String sName)
	{
		this.
		m_sName = sName;
	}
	
	
	
	

	

	/*
	// Show first the usage of basic toString, later
	// show the usage of this method.
	public String toString()
	{
		return "This is a person, name = " + m_sName;
	}
	*/

//	public int hashCode()
//	{
//		return m_sName.hashCode();
//	}
//	public boolean equals(Object other)
//	{
//		//Observe the argument as Person
//		//other can point to chair
//		if (other.getClass() == this.getClass())
//		{
//			Person p = (Person)other;	// down cast
//			//Check if name == name
//			return equals(p);
//		}
//		else
//			return false;
//	}

	public static void main(String args[])
	{
		Person p1 = new Person("Person 1");
		Person p2 = new Person("Person 1");
		System.out.println(p1.equals("yosssi"));
	}
};