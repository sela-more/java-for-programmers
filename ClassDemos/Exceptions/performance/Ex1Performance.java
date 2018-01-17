package performance;
class Ex1Performance
{
	private static final NullPointerException NPE = new NullPointerException();

	public static void main(String args[])
	{
		long lStart = System.currentTimeMillis();
		for (int i = 0 ; i < 10000000 ;  ++i)
		{
			m();
		}
		long lEnd = System.currentTimeMillis();
		System.out.println(lEnd - lStart);
	}

	private static void m()
	{

		/*

		// first version: no catch and try

		String s = "Hello";
		s.toString();
		*/		

		
		// second version : with catch and try
		/*
		String s = "Hello";
		try
		{
			s.toString();
			
		}
		catch (Exception any)
		{
			any.printStackTrace();
		}
		*/

		// Third version : catch and try - add throw
		
		String s = "hello";
		try
		{
			s.toString();
			NullPointerException myEx = new NullPointerException();
			throw myEx;
			//throw NPE; // to reduce cost, use the same variable!
			
		}
		catch (Exception any)
		{
			// at first do not print, since
			// this definetly adds time.
			// later show how this method works.
			//any.printStackTrace();
		}
		


	}
};