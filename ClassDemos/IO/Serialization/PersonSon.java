package Serialization;
import java.io.*;
import java.util.*;

public class PersonSon extends Person implements java.io.Serializable {
	int m_id;
	public PersonSon(String name, int id){
		super(name);
		m_id = id;
	}
	public PersonSon(){
			super("stam");
			m_id = 0;
	}
	public String toString() {return super.toString() + " " + m_id;}
	
	public static void ReadSon() throws Exception
	{
		FileInputStream fis = new FileInputStream("personsSons");
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList ll = new LinkedList();
		Object o = null;
		try {
		while((o = ois.readObject()) != null)
			ll.add(o);
		}
		catch (IOException e){}

		Iterator iter =ll.iterator();
		while(iter.hasNext())
		System.out.println(iter.next());


	}
	
	public static void WriteSons()throws Exception
	{
		PersonSon arr[] = new PersonSon[100];
		for (int i = 0 ; i < arr.length ; ++i )
		{
			arr[i] = new PersonSon("personsSons #" + i,i);
		}

		FileOutputStream fos = new FileOutputStream("personsSons");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0 ; i < arr.length ; ++i )
		{
			oos.writeObject(arr[i]);
		}

		oos.close();
	}
	public static void main(String args[])throws Exception
	{
		PersonSon.WriteSons();
		PersonSon.ReadSon();	
	}

}
