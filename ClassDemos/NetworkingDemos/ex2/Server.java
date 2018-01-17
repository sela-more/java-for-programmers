package ex2;

import java.net.*;
import java.io.*;


class Server
{
	public static void main(String args[])
	{
		try {
			ServerSocket ServSock = new ServerSocket(5000);
			Socket sock = ServSock.accept();
			BufferedReader MyReader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			while (true)
				System.out.println(MyReader.readLine());
			
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
}