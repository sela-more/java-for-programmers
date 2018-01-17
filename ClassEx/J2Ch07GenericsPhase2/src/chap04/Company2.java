package chap04;

import java.util.HashMap;
import java.util.Map;

import chap04.generics.Director;
import chap04.generics.Employee;

public class Company2<E extends Employee> {
	
	private Map <Integer, E> m_map = new HashMap<Integer, E>();
	
	public void add(E emp){
		m_map.put(emp.getId(), emp);
	
	}
	public void printEmployees() {
		for (Employee e : m_map.values())
			System.out.println(e);
			
	}

//	public static void main(String[] args) {
//		Company2<Employee> cmp1 = new Company2<Employee>();
//		Employee guy = new Employee("Guy", "prg", 2);
//		Director jackie = new Director("Jackie", "CEO", 6);
//		Director yaron = new Director("Yaron", "CTO", 6);
//		cmp1.add(guy);
//		cmp1.add(jackie);
//		cmp1.add( yaron);
//
//		
//		cmp1.printEmployees();
//		System.out.println();
//		
//		
//
//	}

}
