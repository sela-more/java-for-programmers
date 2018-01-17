package ArrayEx;

public class Person {
	
	private String _name;
	private int _age;
	private int _salary;
	
	public Person(String name, int age, int salary) {
		_name  = name;
		_age = age;
		_salary = salary;
	}
	public int getAge() {return _age;}
	public String getName() {return _name;}
	public int getSalary() {return _salary;}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + _name + " Age: " + _age + " Salary: " + _salary;
	}
	

}
