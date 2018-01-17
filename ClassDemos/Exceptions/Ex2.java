// demonstrating the handling of Exceptions

class Ex2
{
	public static void main(String args[])
	{
		try
		{
			String s = null;
			System.out.println(s.toString());
						
		}
		
		
		catch (NullPointerException  error)
		{
			System.out.println("String s is null");
			System.out.println(error);	// uses
							// the exception
							// toString method
		}
		
		

		// Now we will get to this line, as we handled the exception earlier.
		System.out.println("This is after the problematic code");		

	}

};