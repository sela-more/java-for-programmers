package clock;
class Viewer extends Thread
{
	private Object m_SynchObj;
	private String m_sID;
	Viewer(Object o, String ID)
	{
		m_SynchObj = o;
		m_sID = ID;
		start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				synchronized(m_SynchObj)
				{
					m_SynchObj.wait();	
					System.out.println("After Wait");
				}
			}
			catch (InterruptedException error)
			{
				error.printStackTrace();
			}
			System.out.println(m_sID + ": " + 
						new java.util.Date().toString());
		}
	}

};