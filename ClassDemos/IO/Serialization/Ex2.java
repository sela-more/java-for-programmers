package Serialization;
import java.io.*;

class Ex2
{
	public static void main(String args[]) throws Exception
	{
		Person arr[] = new Person[100];
		for (int i = 0 ; i < arr.length ; ++i )
		{
			arr[i] = new Person("Person #" + i);
		}

		FileOutputStream fos = new FileOutputStream("persons1");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(arr);
		oos.close();
	}
};