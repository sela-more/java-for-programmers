class Ex3	// Strings as Immutable - performance problems
{
	public static void main(String args[])
	{
		String s = "";
		for (int i = 0 ; i < 100000 ; ++i)
		{
			s += i;
		}
		System.out.println(s);
	}
};

/***

Method void main(java.lang.String[])
   0 ldc #2 <String "">
   2 astore_1
   3 iconst_0
   4 istore_2
   5 goto 30
   8 new #3 <Class java.lang.StringBuffer>
  11 dup
  12 invokespecial #4 <Method java.lang.StringBuffer()>
  15 aload_1
  16 invokevirtual #5 <Method java.lang.StringBuffer append(java.
  19 iload_2
  20 invokevirtual #6 <Method java.lang.StringBuffer append(int)>
  23 invokevirtual #7 <Method java.lang.String toString()>
  26 astore_1
  27 iinc 2 1
  30 iload_2
  31 ldc #8 <Integer 100000>
  33 if_icmplt 8
  36 return
*/