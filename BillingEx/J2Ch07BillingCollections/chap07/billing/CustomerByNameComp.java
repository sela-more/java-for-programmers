package chap07.billing;
import java.util.*;

public class CustomerByNameComp implements Comparator<Customer>{
	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getName().compareTo(c2.getName());
	}
}
