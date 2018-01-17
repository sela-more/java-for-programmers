import java.io.*;

class CopyStreamBuffers
{
	public static void main(String args[])
	{
		InputStream in = null;
		OutputStream out = null;
	
		long lStart = System.currentTimeMillis();
		try {
			String sSourceFile = args[0];
			String sDestFile = args[1];

			in = new BufferedInputStream(new FileInputStream(sSourceFile));
			out = new BufferedOutputStream(new FileOutputStream(sDestFile));
			int nByte;
			while((nByte = in.read()) != -1) //Not EOF
				out.write(nByte);
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