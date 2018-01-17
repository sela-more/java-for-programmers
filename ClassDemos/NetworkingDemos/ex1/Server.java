package ex1;
import java.net.*;

class Server
{
	public static void main(String args[])
	{
		try {
			ServerSocket ServSock = new ServerSocket(5000);
			ServSock.accept();
			System.out.println("Client was connected");
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
}