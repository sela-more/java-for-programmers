package Ex5;
class Person1
{
	private String m_sName;
	Person1(String sNewName) //throws NameTooShortException, NameTooLongException
				// Show compilation error if we do not
				// handle possible errors in some way, 
				// either by try and catch, or throw ahead
				// throws NameTooShortException, NameTooLongException
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

	public static void main(String args[]) 
	{
		Person1 p = null;
		try
		{
			p = new Person1(args[0]);
		}
		//Option #1 - catch block for each exception
		
		
		catch (NameTooShortException error)
		{
			System.out.println("Short Name issue, please hanle");
		}
		catch (NameTooLongException error)
		{
			System.out.println("Long Name issue, please hanle");
		}
		
		finally
		{
			System.out.println("In Finally");
			
		}
		/*
	
		//Option #2 - catch all name exception
		
		catch(NameException error)
		{
			System.out.println("Name problem, type: " + error + " with name: " + error.getFaultName());
		}
		finally
		{
			System.out.println("In Finally");
			
		}
		*/		
		
	}
};