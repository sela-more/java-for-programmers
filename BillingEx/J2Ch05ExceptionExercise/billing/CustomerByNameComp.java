package billing;
import java.util.*;

public class CustomerByNameComp implements Comparator{
	public int compare(Object o1, Object o2) {
		Customer c1 = (Customer)o1;
		Customer c2 = (Customer)o2;

		return c1.getName().compareTo(c2.getName());
	}
}
