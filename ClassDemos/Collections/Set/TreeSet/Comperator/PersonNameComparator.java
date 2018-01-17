package Set.TreeSet.Comperator;
import java.util.Comparator;

class PersonNameComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		PersonTSComperator p1 = (PersonTSComperator)o1;
		PersonTSComperator p2 = (PersonTSComperator)o2;
		return p1.getName().compareTo(p2.getName());
	}
};