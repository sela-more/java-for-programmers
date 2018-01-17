import java.io.*;

class CopyFileStreams
{
	public static void main(String args[])
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		byte Buffer[] = new byte[1024];
		long lStart = System.currentTimeMillis();
		try {
			String sSourceFile = args[0];
			String sDestFile = args[1];

			in = new FileInputStream(sSourceFile);
			out = new FileOutputStream(sDestFile);

			int nByte;
			// Version 1: read one byte at a time
			while ((nByte = in.read()) != -1)
				out.write(nByte);
			// version 2: use buffered reading
			/*
			while((nByte = in.read(Buffer)) != -1) //Not EOF
				out.write(Buffer);
			*/
			long lEnd = System.currentTimeMillis();
			System.out.println(lEnd - lStart);
		}
		catch (IOException error)
		{
			//failed
			System.out.println("Error");
			error.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (Throwable error)
			{
			}

			try
			{
				out.close();
			}
			catch (Throwable error)
			{
			}
		}
	}
};