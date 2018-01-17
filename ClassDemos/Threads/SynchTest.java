class SynchTest
{
	static int i;
	static void m(int j)
	{
		j = i;
	}

	static synchronized void synchm(int j)
	{
		j = i;
	}

	public static void main(String args[])
	{
		long lStart = System.currentTimeMillis();
		for (int i = 0 ; i < 10000000 ; ++i)
		{
			synchm(i);
		}
		long lEnd = System.currentTimeMillis();
		System.out.println("sync version is: "  + (lEnd - lStart));


		lStart = System.currentTimeMillis();
		for (int i = 0 ; i < 10000000 ; ++i)
		{
			m(i);
		}
		lEnd = System.currentTimeMillis();
		System.out.println("regular version is: "  + (lEnd - lStart));
	}
}