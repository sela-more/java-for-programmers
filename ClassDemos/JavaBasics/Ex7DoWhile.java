class Ex7DoWhile
{
	public static void main(String args[])
	{
	
		char cArr[] = {'a','b','c','9','d'};
		int i = 0;

		do
		{   		
 	           System.out.println(cArr[i]);
		}  while(cArr[++i] != '9');
	}
}