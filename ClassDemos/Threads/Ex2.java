//Clock version #1
class Ex2 extends Thread
{
	Ex2()
	{
		//start();
	}
	public void run()
	{
		try
		{
			int i = 0;
			while(true)
			{
				System.out.println("i = " + i++);
				sleep(1000);
			}
		}
		catch (InterruptedException error)
		{
		}
	}


	public static void main(String args[])
	{
		Ex2 myEx2 = new Ex2();
		myEx2.start();
		new Ex2().start();
		new Ex2(); // by itself does nothing
		
		System.out.println("Out of main");
	}
};