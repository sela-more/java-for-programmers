package Set.TreeSet.Comperable;
import java.util.*;
class MainTSComperable
{
	public static void main(String args[])
	{
		Set<PersonTSComperable> s = new TreeSet<PersonTSComperable>();
		
		for (int i = 0 ; i < args.length ;++i )
			s.add(new PersonTSComperable(args[i]));

		Iterator<PersonTSComperable> iter = s.iterator();
		while(iter.hasNext())
		{
			Object o = iter.next();
			System.out.println(o); //--> inside println --> o.toString();
		}
	}
};