class AllSyncOptions {
	//**************************************************************************
	//Object Methods
	//**************************************************************************
	synchronized void m1()
	{
	}
	void m2()
	{
		synchronized (this)
		{
		}
	}
	//**************************************************************************
	//Static Methods
	//**************************************************************************
	static synchronized void m3()
	{
	}
	void m4()
	{
		synchronized (AllSyncOptions.class)
		{
		}
	}
	
}