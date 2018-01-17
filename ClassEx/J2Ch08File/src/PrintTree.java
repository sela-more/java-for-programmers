import java.io.*;

class PrintTree
{
	public static void main(String args[])
	{
		PrintTree tree = new PrintTree();

	}
	PrintTree()
	{
		File dir = new File("C:\\Users\\Michal\\workspace\\J2CourseExSolutions");
		print(dir,"");


	}
	public void print(File directory,String indent)
	{

		File[] myFiles = directory.listFiles();
		
		String spaces = indent;
		for (int i=0;i<myFiles.length;i++)
		{
		   System.out.println(spaces + myFiles[i].getName());
		   if (myFiles[i].isDirectory() && (myFiles[i].listFiles() != null))
		   	  print(myFiles[i],spaces+"---");


		}

	}

}