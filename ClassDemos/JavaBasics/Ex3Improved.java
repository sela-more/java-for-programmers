class Ex3Improved   // Usage of StringBuffer instead of string
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer();
		for (int i = 0 ; i < 100000 ; ++i)
		{
			s.append(i);
		}
		String s2 = s.toString();
	}
}
/***
Method void main(java.lang.String[])
   0 new #2 <Class java.lang.StringBuffer>
   3 dup
   4 invokespecial #3 <Method java.lang.StringBuffer()>
   7 astore_1
   8 iconst_0
   9 istore_2
  10 goto 22
  13 aload_1
  14 iload_2
  15 invokevirtual #4 <Method java.lang.StringBuffer append(int)>
  18 pop
  19 iinc 2 1
  22 iload_2
  23 ldc #5 <Integer 100000>
  25 if_icmplt 13
  28 aload_1
  29 invokevirtual #6 <Method java.lang.String toString()>
  32 astore_3
  33 return
 */