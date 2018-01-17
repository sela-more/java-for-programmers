package Set.HashSet;
import java.util.*;
class Ex1
{
	public static void main(String args[])
	{
		Set s = new HashSet();
		for (int i = 0 ; i < args.length ;++i )
			s.add(new Person(args[i]));

		Iterator iter = s.iterator();
		while(iter.hasNext())
		{
			Object o = iter.next();
			System.out.println(o); //--> inside println --> o.toString();
		}
	}
};