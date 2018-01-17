class Ex2	// demonstrating Strings
{
	public static void main(String args[])
	{
		String s1 = "Hello";	// No need to allocate memory
		String s2 = " World".toUpperCase();
		String s3 = s1 + s2;	// Operator + Overloaded for Strings only
		//String s4 = s1;
		//s4 += s2;
		String s4 = s3;
		s4 += s4;
		s4 = s4.toUpperCase();
		s4 = s4.trim();
		s4 = s4.substring(2);
		System.out.println(s4);
	}
};