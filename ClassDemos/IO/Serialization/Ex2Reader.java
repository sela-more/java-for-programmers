package Serialization;
import java.io.*;
class Ex2Reader
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis = new FileInputStream("persons1");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person arr[];

		arr = (Person[])ois.readObject();
		for (int i = 0 ; i < arr.length ;++i )
		{
			System.out.println(arr[i]);
		}

	}
};