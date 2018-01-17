package Set.TreeSet.Comperator;
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		
		Set s = new TreeSet(new PersonNameComparator());
		for (int i = 0 ; i < args.length ;++i )
			s.add(new PersonTSComperator(args[i],i));
		System.out.println("Iterating with Name comparison");
		Iterator iter = s.iterator();
		while(iter.hasNext())
		{
			Object o = iter.next();
			System.out.println(o); //--> inside println --> o.toString();
		}
		
		
		Set s2 = new TreeSet(new PersonAgeComparator());
		
		s2.addAll(s);
		System.out.println("Iterating with Age comparison");
		iter = s2.iterator();
		while(iter.hasNext())
		{
			Object o = iter.next();
			System.out.println(o); //--> inside println --> o.toString();
		}
	}
};