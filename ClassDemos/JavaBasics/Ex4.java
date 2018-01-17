class Ex4		// Demonstrating arrays
{
	public static void main(String args[])
	{
		int arr[];	// Declaration
		arr = new int[3];	// Initialization: note: allocation
		int temp[] = new int[6];	// Declaration + Initialization
		for (int i = 0 ; i < 3  ;  ++i)
		{
			temp[i] = arr[i];	// Assignment and read from array
						// try and have i = 6
						// and see how java runtime
						// "behaves" with out of bounds
			System.out.println(temp[i]); // note each cell is initialized, not garbage
		}
		arr = temp;			// Reference to the whole array
		byte b[] = new byte[1024];	// Array of byes: declaration + initialization

	}
};