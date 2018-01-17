import java.io.FileInputStream;
import java.io.IOException;


public class FinallyBlock {
	 public static void main(String args[])  {
			try (FileInputStream m_fis = new FileInputStream("FinallyBlock.java")){  // note the new finally format for closable
					m_fis.read();
				}
				catch(IOException e){
					System.out.println("Read error occurred");
				}
				
			}

}
