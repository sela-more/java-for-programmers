package chap04;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import chap04.generics.Employee;

public class Company {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Company cmp1 = new Company();
		cmp1.add(new Employee("Guy", "CEO", 2));
		cmp1.add(new Employee("Jackie", "prg", 6));
		cmp1.add(new Employee("Yaron", "prg", 5));
		cmp1.add(new Employee("Moses", "prg", 4, 1));

		Collection<Employee> coll = cmp1.getEmployees();
		cmp1.printEmployees(coll);
		
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(new Employee("guy", "CTO", 3));
	}
	
	public Collection<Employee> getEmployees() {
		return m_map.values();
	}
	
	public void printEmployees(Collection<Employee> c) {
		Iterator<Employee> i = c.iterator();
		while(i.hasNext()) {
			i.next().printEmployee();
		}
	}
	
	public void add(Employee e) {
		m_map.put(e.getId(), e);
	}
	
	private Map<Integer, Employee> m_map =
		new HashMap<Integer, Employee>();		
}
