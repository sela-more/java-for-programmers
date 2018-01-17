package Ex6;
class Person2
{
	private String m_sName;
	Person2(String sNewName) 
				 throws NameTooShortException, NameTooLongException
	{
		setName(sNewName);
	}
	void setName(String sNewName) 
				throws NameTooShortException, NameTooLongException
	{
		if (sNewName.length() < 4)
			throw new NameTooShortException("Name Too Short",sNewName);
		if (sNewName.length() > 8)
			throw new NameTooLongException("Name Too Long",sNewName);
		m_sName = sNewName;
	}

	// Note: now main itself throws an exception 
	public static void main(String args[]) throws NameTooShortException
	{
		Person2 p = null;
		try
		{
			p = new Person2(args[0]);
		}
		catch (NameTooShortException error)
		{
			System.out.println("BAD PROBLEM");
			throw error;	// Note the option to throw
					// requires main will throw in
					// its list as well
		}
		catch(NameException error)
		{
			System.out.println("I will handle...");
		}
		finally
		{
			System.out.println("In Finally");
			//throw new NullPointerException(); // Do not do!
		}
	}
};