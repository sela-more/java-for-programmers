package Serialization;
import java.io.*;
public class Mat implements java.io.Externalizable
{
	int arr[][];
	public Mat(){}
	Mat(int width, int height)
	{
		init(width, height);
	}

	private void init(int width, int height)
	{
		arr = new int[width][height];
		for (int i = 0 ; i < width ; ++i )
		{
			for (int j = 0 ; j < height ; ++j)
			{
				arr[i][j] = i * j;
			}
		}
	}

	int mult(int x, int y)
	{
		return arr[x][y]; //== x * y
	}

	public void readExternal(ObjectInput in) throws IOException
	{
		int width = in.readInt();
		int height = in.readInt();
		init(width, height);
	}
	public void writeExternal(ObjectOutput out) throws IOException
	{
		out.writeInt(arr.length);
		out.writeInt(arr[0].length);
	}
	public static void main(String args[]) throws Exception
	{
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mat1"));
		oos.writeObject(new Mat(1000, 1000));
		oos.close();
		
		/*
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mat1"));
		Mat m = (Mat)ois.readObject();
		ois.close();
		
		for (int i = 0 ; i < m.arr.length ; ++i )
		{
			for (int j = 0 ; j < m.arr[i].length ; ++j)
			{
				System.out.print(m.mult(i,j) + " ");
			}
			System.out.println("");
		}
		*/
		
		
	}
};