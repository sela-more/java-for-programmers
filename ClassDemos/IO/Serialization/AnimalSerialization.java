package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AnimalSerialization implements Serializable
{
	   String myName;
	   private String type;

	   AnimalSerialization(String newName, String animalType) {
		myName=newName;
		type = animalType;
	   }

	   public static void main(String args[]) {
		   AnimalSerialization shraga = new AnimalSerialization("Shraga", "Duck");
	   try{
		serializeAnimal(shraga);
	   } catch(IOException io) {
		 io.printStackTrace();
	   } catch (ClassNotFoundException e) {
		e.printStackTrace();
	   }
	}
	   static void serializeAnimal(AnimalSerialization animObj) throws IOException, ClassNotFoundException {
		   FileOutputStream out = new FileOutputStream("file.txt");
		   ObjectOutputStream objOut = new ObjectOutputStream(out);
		   objOut.writeObject(animObj);// Write to file

		    FileInputStream in = new FileInputStream("file.txt");
		    ObjectInputStream objIn = new ObjectInputStream(in);
		    AnimalSerialization newAnimal = (AnimalSerialization)objIn.readObject(); // Read from file

		    System.out.println(newAnimal.myName);
		    System.out.println(newAnimal.type);
		  }
		} // End of class
