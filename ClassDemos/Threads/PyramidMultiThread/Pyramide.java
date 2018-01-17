package PyramidMultiThread;
class Pyramide implements Runnable
{
	char m_printable;
	int m_height;
	long m_sleepInterval;
	

	Pyramide(char printable, int height, long sleepInterval) {

		m_printable = printable;
		m_height = height;
		m_sleepInterval = sleepInterval;

		// activate the thread
		//new Thread((Runnable)this).start();
		startThreads(20); // run multiple threads.
	}

	
	private void startThreads(int nNumOfThreads)
	{
		for (int i = 0 ; i < nNumOfThreads ; ++i )
		{
			new Thread((Runnable)this).start();
		}
	}
	public void run() {
		int i=0;
	
		for (i =0; i < m_height; ++i)
		{
			drawLine(i);
			try
			{
				
				Thread.currentThread().sleep(m_sleepInterval);
				
			}
			catch (InterruptedException e)
			{
			}
			
			
		}
	}
	// version one: show the problem: no sync
	public void drawLine (int width) {

	// version two: solution: synchronized object method
	// Use the object monitor bit by making the method 
	// synchronized.
	//public  synchronized void drawLine (int width) {

	// Version three: using synchronized blocks (dont forget to close the block)
	//  synchronized(this) {
	
	
		for (int j=0;j<=width;++j )
		{
			System.out.print(m_printable);
	
		}
		System.out.println("");
	  //}
	}
	public static void main (String args[]) {

		int i = 5;
		long l = 200;
		char c = 'x';



		new Pyramide(c, i, l);
		System.out.println("after start");
	}
};