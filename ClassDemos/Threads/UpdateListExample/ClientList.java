package UpdateListExample;
import java.util.*;

// demonstrates the need to lock up a common resource like a linked list.

class ClientList extends Thread
{
	private LinkedList m_list;
	private int m_indexToRemove;
	public ClientList(LinkedList list,int indexToRemove)
	{
		m_list = list;
		m_indexToRemove = indexToRemove;
		start();
	}

	public void run()
	{

		
	  synchronized (m_list) {
				
		int size = m_list.size();
		System.out.println("size of list is: " + size);
		System.out.println("Removing index #: " + m_indexToRemove);
		
		if (size > m_indexToRemove)
			m_list.remove(m_indexToRemove);
		System.out.println(m_list);
	  }

	}

	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add("Hello1");
		list.add("Hello2");
		list.add("Hello3");
		list.add("Hello4");
		list.add("Hello5");
		list.add("Hello6");

		ClientList c1 = new ClientList(list,2);
		ClientList c2 = new ClientList(list,2);
		ClientList c3 = new ClientList(list,2);
		ClientList c4 = new ClientList(list,2);
		ClientList c5 = new ClientList(list,2);
		ClientList c6 = new ClientList(list,2);

		
	}
}