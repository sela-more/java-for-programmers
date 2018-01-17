import java.io.*;

class ReadKeyboard
{
	public static void main(String args[])
	{
		InputStreamReader stdin		= new InputStreamReader(System.in);
		BufferedReader    bufRead 	= new BufferedReader(stdin);
		while(true)
		{
		  try
		  {
			System.out.println(bufRead.readLine());
		  }
		  catch(IOException io)
		  {
		  	io.printStackTrace();
		  }
		}

	}



}