class Contact
{
	String m_sFName;
	String m_sLName;

	public Contact(String fname,String lname)
	{
		m_sFName = fname;
		m_sLName = lname;
		ContactList.register(this);
	}
	public String getName()
	{
		return m_sFName + " " + m_sLName;
	}
}