package OverridingObjectMethodsDemo.isInstanceProblem;




class SpecialObjectSon extends SpecialObject
{

	int m_nID;
	SpecialObjectSon(String sName, int nID) 
	{
		super(sName);
		m_nID = nID;	
	}
	
	
	public boolean equals(Object other)
	{
		
		if (!(other instanceof SpecialObjectSon) )
		//if (other.getClass() != this.getClass())
			return false;
		

		SpecialObjectSon sOS = (SpecialObjectSon) other;
		return ((m_sName.equals(sOS.m_sName)) &&
				(m_nID == sOS.m_nID));
	}
	
}