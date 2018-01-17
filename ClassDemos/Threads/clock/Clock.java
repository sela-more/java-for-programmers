package clock;
class Clock extends Thread
{
	Clock()
	{
		start(); // start the thread
	}
	//Entry point for thread
	public void run()
	{
		while(true)
		{
			//sleep for 1 second
			try
			{
				Thread.currentThread().sleep(1000);
				//Thread.sleep();	
				synchronized(this)
				{
					this.notifyAll(); //notify();
					System.out.println("After Notify");
					
				}
			}
			catch (InterruptedException error)
			{
				error.printStackTrace();
			}

		}
	}
};