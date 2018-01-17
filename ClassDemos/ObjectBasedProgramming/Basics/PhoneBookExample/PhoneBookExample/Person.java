package PhoneBookExample;
class Person
{
	String m_sName;
	String m_sPhone;
	void setPhoneNumber(String phone)
	{
		m_sPhone = phone;
	}

	void setName(String name)
	{
		m_sName = name;
	}

	void print()
	{
		System.out.println("Name = " + m_sName + 
							" Phone = " + m_sPhone);
	}
};