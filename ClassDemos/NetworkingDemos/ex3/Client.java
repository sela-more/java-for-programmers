package ex3;

import java.net.*;
import java.io.*;

class Client
{
	static BufferedReader stdin;
	static {
		stdin = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String args[])
	{
		try {
			Socket s = new Socket(args[0], Integer.parseInt(args[1]));
			OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
			BufferedWriter bw = new BufferedWriter(osw);

			BufferedReader ReaderFromSock = new BufferedReader(new InputStreamReader(s.getInputStream()));
			

			while(true)
			{
				//Read line from starndard input
				String sLine = stdin.readLine();
				//write line to socket
				bw.write(sLine);
				bw.newLine();
				bw.flush();
				if (sLine.equals("quit"))
					System.exit(1);

				//Read result from server
				System.out.println("got this from server: " + ReaderFromSock.readLine());
				
			}
		}
		catch (Exception e)
		{
		}
	}
}