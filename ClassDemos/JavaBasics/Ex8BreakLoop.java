class Ex8BreakLoop
{
	
	public static void main(String a[])
	{

		int[] a1 = {2, 3, 6, 8, 10, 12, 14};
		int[] a2 = {1, 50, 40, 14, 16, 40};
		int i=0,j=0;
	
		looop: 
		for(i=0;i<a1.length;++i) 
		{
		   for(j=0;j<a2.length;++j) 
		   {
		      if(a1[i] == a2[j])
			{
		          System.out.println("i= " +i+ " j= " +j);
			  System.out.println("equal num --> " +a1[i]);
   		        break looop;		
			}    
 		   }
		}
	
		
	}
}
