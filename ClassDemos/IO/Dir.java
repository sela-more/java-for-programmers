import java.io.*;
class Dir
{
	public static void main(String args[])
	{
		File f = new File(args[0]);
		String arr[] = f.list();
		for (int i = 0 ; i < arr.length ; ++i )
			System.out.println(arr[i]);
	}
};