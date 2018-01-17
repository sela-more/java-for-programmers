import java.io.RandomAccessFile;


public class RandomAccessExample {
	public static void main(String args[])
	  {
		try {
		 RandomAccessFile raf = new  RandomAccessFile("RandomAccessExample.java", "r");
		 System.out.println("File opened. Reading:");
		 System.out.println(raf.readLine() + "\n");
		 raf.skipBytes(10); 	// Skip from current position
		 System.out.println("After skipping 10 bytes: "+ raf.readLine());
		 raf.seek(10);  	// Skip from beginning of file
		 System.out.println("After seeking 10 bytes: "+raf.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }

}
