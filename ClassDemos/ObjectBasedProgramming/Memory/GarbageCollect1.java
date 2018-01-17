class GarbageCollect1
{
	private static int m_nCounter;
	private String m_sName;

	public GarbageCollect1()
	{
			m_sName = "Instance #" + ++m_nCounter;
			System.out.println(m_sName);
	}
		
	public static int getCounter()
	{
		return m_nCounter;
	}

	public void finalize()
	{
		System.out.println(m_sName + " was collected");
		--m_nCounter;
	}

	public static void main(String args[])
	{
		GarbageCollect1 g;
		while (GarbageCollect1.getCounter() < 10000)
		{
			g = new GarbageCollect1();
			System.gc();
		}
		
	}



	
}