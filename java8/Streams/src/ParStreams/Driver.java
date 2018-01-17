package ParStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Supplier;

public class Driver {
	
	public static void main(String[] args)   {
		Collection<Supplier<String>> tasks = new ArrayList<>();
		File dir = new File(".");
		for (File f : dir.listFiles()){
			if (! f.isDirectory()){
				tasks.add(()->getInputFromFile(f));
			}
		}
		tasks.parallelStream().forEach((t)->System.out.println(t.get()));
	}

	private static String getInputFromFile(File f){
      	String result = null;

		try {
      		System.out.println(f.getName());
     		result = new BufferedReader(new InputStreamReader(
				new FileInputStream(f))).readLine();
      	} catch (IOException ioe) {
         		System.out.println("IO error trying to read file!");
         		return null;
      	}
      	return result;
	}


}
