package ex3;

import java.net.*;
import java.io.*;


class Server extends Thread
{
	private Socket m_Client;

	public Server(Socket sClient)
	{
		m_Client = sClient;
	}

	public void run()
	{
		System.out.println("New client was started");
		try {
			BufferedReader MyReader = new BufferedReader(new InputStreamReader(m_Client.getInputStream()));

			OutputStream os = m_Client.getOutputStream();
			Writer w = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(w);
			
			String sLine;
			while(!(sLine = MyReader.readLine()).equals("quit"))
			{
				bw.write(sLine.toUpperCase());
				bw.newLine();
				bw.flush();
			}
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}

	public static void main(String args[])
	{
		try {
			ServerSocket ServSock = new ServerSocket(5000);
			while (true)
			{
				Socket sock = ServSock.accept();
				System.out.println("client Accepted");
				Server sv = new Server(sock);
				sv.start();
			}
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
}