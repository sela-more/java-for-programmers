package chap04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import chap04.generics.Director;
import chap04.generics.Employee;

public class Company {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Company cmp1 = new Company();
		Employee guy = new Employee("Guy", "prg", 2);
		Director jackie = new Director("Jackie", "CEO", 6);
		Director yaron = new Director("Yaron", "CTO", 6);
		cmp1.add(guy.getId(), guy, cmp1.getEmployeesMap());
		
		cmp1.add(jackie.getId(), jackie, cmp1.getDirectorsMap());
		cmp1.add(yaron.getId(), yaron, cmp1.getDirectorsMap());
		
		//cmp1.add(jackie.getId(), jackie, cmp1.getEmployeesMap());

		Collection<? extends Employee> coll = cmp1.getEmployees();
		
		cmp1.printEmployees(coll);
		
		System.out.println();
		
		coll = cmp1.getDirectors();
		cmp1.printEmployees(coll);
	}
	
	public Collection<Employee> getEmployees() {
		return m_employeesMap.values();
	}
	
	public Collection<Director> getDirectors() {
		return m_directorsMap.values();
	}
	
	public void printEmployees(Collection<? extends Employee> c) {
		Iterator<? extends Employee> i = c.iterator();
		while(i.hasNext()) {
			i.next().printEmployee();
		}
	}
	
	public Map<Integer, Employee> getEmployeesMap() {
		return m_employeesMap;
	}
	
	public Map<Integer, Director> getDirectorsMap() {
		return m_directorsMap;
	}
	
	public <T>void add(int employeeId, T t, 
			Map<Integer, T> map) {
		map.put(employeeId, t);
	}
	
	private Map<Integer, Employee> m_employeesMap =
		new HashMap<Integer, Employee>();
	
	private Map<Integer, Director> m_directorsMap =
		new HashMap<Integer, Director>();
	
	

}
