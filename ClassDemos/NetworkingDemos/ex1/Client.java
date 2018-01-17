package ex1;
import java.net.*;

class Client
{
	public static void main(String args[])
	{
		try {
			Socket s = new Socket(args[0], Integer.parseInt(args[1]));
		}
		catch (Exception e)
		{
		}
	}
}