package ReduceSumFilter;

import java.util.OptionalInt;
import java.util.stream.Stream;

public class Employee {
	
	private String _name;
	private Gender _gender;
	private int _seniority;
	private int _sallary;
	private static int _counter = 0;

	public Employee(){
		_name = "Employee" + ++_counter;
		_gender = Gender.Female;
		_seniority = 0;
		_sallary = 4000;
	}

	public Employee(String name, Gender gender, int seniority, int sallary) {
		super();
		this._name = name;
		this._gender = gender;
		this._seniority = seniority;
		this._sallary = sallary;
	}
	
	public int getSeniority() { return _seniority;}
	public void setSeniority(int seniority) { this._seniority = seniority; }
	public int getSallary() { return _sallary; }
	public void setSallary(int sallary) { this._sallary = sallary;}
	public String getName() { return _name;}
	public Gender getGender() { return _gender;}
	@Override
	public int hashCode() {
     	final int prime = 31;
		int result = 1;
		result = prime * result + ((_gender == null) ? 0 :	_gender.hashCode());
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		return result;
	}
	
	@Override
	public String toString() { return "Employee [name=" + _name + "]";}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (_gender != other._gender)
			return false;
		if (_name == null) {
		if (other._name != null)
			return false;
		} else if (!_name.equals(other._name))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
//		Stream<Employee> employees = Stream.of(new Employee(), 
//				new Employee(), new Employee());
//		OptionalInt x = employees.mapToInt(
//			e->e.getSallary()).reduce((a,b) -> a + b);
//		System.out.println(x);
		
//		Stream<Employee> employees = Stream.of(new Employee(), 
//				new Employee(), new Employee());
//			int x = employees.mapToInt(e->e.getSallary()).sum();
//			System.out.println(x);
		
		Employee moshe = new Employee("moshe", Gender.Male, 5, 10000);
		Employee david = new Employee("david", Gender.Male, 3, 5000);
		Employee rina = new Employee("rina", Gender.Female, 3, 5000);
		Stream<Employee> e = Stream.of(moshe, david, rina);
		Stream<Employee> s = e.filter(em-> em.getSallary() > 6000 && 
			em.getSeniority() > 2);
		s.forEach(emp->System.out.println(emp));



	}




}
