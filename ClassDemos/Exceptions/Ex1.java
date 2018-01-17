// demonstrating Exceptions - initial example - before handling them

class Ex1
{
	public static void main(String args[])
	{
		String s = null;
		System.out.println(s.toString());

		// The following line will not be performed since
		// we will have a null string error above
		
		System.out.println("This is after the problematic code");		
		

	}

};