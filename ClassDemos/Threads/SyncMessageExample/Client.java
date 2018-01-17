package SyncMessageExample;
class Client extends Thread
{
	private Message m_msg;
	private int m_nStartValue;
	public Client(Message msg, int nStartValue)
	{
		m_msg = msg;
		m_nStartValue = nStartValue;
	}

	public void run()
	{
		for (int i = 0 ; i < 3 ; ++i)
		{

			m_msg.addNumber(m_nStartValue + i);
		}
	}
}