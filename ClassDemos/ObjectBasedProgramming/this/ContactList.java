class ContactList
{
	static Contact[] m_arrContact;
	static int counter;
	static
	{
		m_arrContact = new Contact[10];		
	}

	private ContactList()
	{
	
	}

	public static void register(Contact contact)
	{
		
		m_arrContact[counter] = contact;
		counter++;
				
		
	}
	public static void print()
	{
		
		for (int i=0;i<counter;i++)
		{
		      System.out.println("Contact --> " +  m_arrContact[i].getName());
		}
		
	}
}