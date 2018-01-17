package Serialization;
import java.io.*;

class Ex1
{
	public static void main(String args[]) throws Exception
	{
		//Person arr[] = new PersonSon[100];
		Person arr[] = new Person[100];
		for (int i = 0 ; i < arr.length ; ++i )
		{
			//arr[i] = new PersonSon("Person #" + i,i);
			arr[i] = new Person("Person #" + i);
		}

		FileOutputStream fos = new FileOutputStream("persons");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0 ; i < arr.length ; ++i )
		{
			oos.writeObject(arr[i]);
		}

		oos.close();
	}
};