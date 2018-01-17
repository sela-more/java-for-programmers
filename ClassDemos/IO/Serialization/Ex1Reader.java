package Serialization;
import java.io.*;
import java.util.*;
class Ex1Reader
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis = new FileInputStream("persons");
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList ll = new LinkedList();
		Object o = null;
		try {
		while((o = ois.readObject()) != null)
			ll.add(o);
		}
		catch (IOException e){
			System.out.println(e);
		}

		Iterator iter =ll.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());


	}
};