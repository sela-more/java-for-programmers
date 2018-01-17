package SyncMessageExample;
class Main
{
	public static void main(String args[])
	{
		Message m = new Message();
		Client c[] = {new Client(m, 1), new Client(m, 4), new Client(m, 7)};
		for (int i = 0 ; i < c.length ; ++i)
			c[i].start();
	}
}