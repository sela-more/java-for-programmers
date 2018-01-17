import java.io.*;

public class CopyReaderWriterBuffers
 {
    public static void main(String[] args) 
     {
	try
	{
		long lStart = System.currentTimeMillis();
        	FileReader in   = new FileReader(args[0]);
		FileWriter out = new FileWriter(args[1]);
		BufferedReader bufIn = new BufferedReader(in);
		BufferedWriter bufOut = new BufferedWriter(out);
        	String line;
		
	        while ((line = bufIn.readLine()) != null)
		{
        	   bufOut.write(line,0,line.length());
		   bufOut.newLine();
		}

	        bufIn.close();
        	bufOut.close();
		long lEnd = System.currentTimeMillis();
		System.out.println("Total time (milisec) = " + (lEnd - lStart));
	}
	catch (IOException io)
	{
		System.err.println("**An IO problem has occurred " + io);
	}
    }
}
