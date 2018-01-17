package ex2;

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

			while (true)
			{
				String sLine = stdin.readLine();
				bw.write(sLine, 0, sLine.length());
				bw.newLine();
				bw.flush();
			}
		}
		catch (Exception e)
		{
		}
	}
}