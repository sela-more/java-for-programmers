import java.io.*;

public class CopyFileReaderWriter
 {
    public static void main(String[] args) 
     {
	try
	{
		long lStart = System.currentTimeMillis();
        	FileReader in   = new FileReader(args[0]);
		FileWriter out = new FileWriter(args[1]);
        	int c;
		char[] bufSize = new char[128];

	        while ((c = in.read(bufSize)) != -1)
        	   out.write(bufSize,0,c);

	        in.close();
        	out.close();
		long lEnd = System.currentTimeMillis();
		System.out.println("Total time (milisec) = " + (lEnd - lStart));
	}
	catch (IOException io)
	{
		System.err.println("**An IO problem has occurred " + io);
	}
    }
}
