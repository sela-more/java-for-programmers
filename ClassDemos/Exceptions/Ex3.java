// demonstrating the handling of Exceptions
// Show : multiple catch blocks, the order of generality


class Ex3
{
	public static void main(String args[])
	{
		try
		{
			// possible problem number one
			
			System.out.println("Before Possible error: printing empty args");
			System.out.println(args[0]);
			System.out.println("After Possible error: printing empty args");

			// possible problem number two - will not get
			// here if we have an exception
			String s = null;
			System.out.println(s.toString());
			
			
		}
		/******* a sequence of catch blocks *****/
		catch (NullPointerException error)
		{
			System.out.println("String s is null");
		}
		catch (ArrayIndexOutOfBoundsException myException)
		{
			System.out.println("usage: java Ex1 [param]");
		}
		catch (Exception any)
		{
			System.err.println("Exception occured, " + any);
			System.exit(1);
		}
		finally {
		
			System.out.println("Code That will be printed either if we have an error or not.");
		}

	}

};