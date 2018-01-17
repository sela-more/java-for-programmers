//Clock version #1
class Ex3 implements Runnable
{
	Ex3()
	{
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			int i = 0;
			while(true)
			{
				System.out.println("i = " + i++);
				System.out.println(Thread.currentThread().getClass());
				Thread.currentThread().sleep(1000);
			}
		}
		catch (InterruptedException error)
		{
		}
	}


	public static void main(String args[])
	{
		//logic
		new Ex3();
		new Ex3();
		System.out.println("Out of main");
	}
};