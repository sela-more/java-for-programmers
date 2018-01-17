class BigObject
{
	int arr[][] = new int[50][50];
	static int counter;
	BigObject()
	{
		
		System.out.println("BigObject was created" + counter++);
	}
	

	public void finalize() // note usage
	{
		System.out.println("##### BigObject was deleted" + counter--);
	}


	public static void main(String args[])
	{
		while(true)
		{
			new BigObject();
			System.gc();	// recommendation to the system
		}
	}
};