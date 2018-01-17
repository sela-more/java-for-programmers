package SyncMessageExample;
class Message
{
	private String m_sMessage = "";

	
	public void addNumber(int nNumber)

	// one sync option
	//public synchronized void addNumber(int nNumber)
	{

	  // demonstrate the problem in synching on a String
	  synchronized (m_sMessage) {

	  // possible second solution (other than syncing on the whole
	  // method
	  // synchronized (this) {
		
		for (int i = 0 ; i <  nNumber ; ++i)
		{
			try {
				Thread.sleep(100);
			}
			catch (Exception e)
			{
			}
			m_sMessage += nNumber;
		}
		System.out.println("The message is: " + m_sMessage);
	   }
		
	}
}
