package OverridingObjectMethodsDemo.isInstanceProblem;
class SpecialObject // extends Object;
{
	String m_sName;

	SpecialObject(String sName)
	{
		//super();
		m_sName = sName;
	}

	
	public String toString()
	{
		return "This is a SpecialObject, name = " + m_sName;
	}

	public int hashCode()
	{
		return m_sName.hashCode();
		// if we had several members, we are advised to use
		// multiplication by prime numbers in order to statistically be OK
		// return (m_sName.hashCode() *3 ) + (m_sLast.hashCode()* 7);
	}

	public boolean equals(Object other)
	{
		//Observe the argument as SpecialObject
		//other can point to chair

		// show the difference between getClass and isInstanceOf		
		if ( other instanceof SpecialObject )  
		
		
		// solution: use getClass
		// if (other.getClass() == this.getClass())
		{
			SpecialObject SObject = (SpecialObject)other;
			//Check if name == name
			return m_sName.equals(SObject.m_sName);
		}
		else
			return false;
	}
	
}