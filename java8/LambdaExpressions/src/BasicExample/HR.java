package BasicExample;

public class HR {
	
	Employee[] _employees;
	int _counter;
	
	public HR(int num ) {
		_employees = new Employee[num];
	}
	
	public void addEmployee(Employee e) {
		if (_counter < _employees.length) {
			_employees[_counter] = e;
			_counter++;
		}
		
		else
			throw new IndexOutOfBoundsException("Too many employees managed by HR");
	}
	
	public void printAll(){
		for (Employee e : _employees){
			if (e != null) {
					System.out.println(e);
			}
		}
		
	}
	
	public void printFilteredEmployees(FilterEmployee filter, int high, int low){
		for (Employee e : _employees){
			if (e != null) {
		
				if (filter.accept(e, high, low)){
						System.out.println(e);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		HR hr = new HR(3);
		
		
		
		hr.addEmployee(new Employee("Michal",Gender.Female, 15, 10000));
		hr.addEmployee(new Employee("Daniel",Gender.Male, 7, 20000));
		hr.addEmployee(new Employee("ZZZ",Gender.Female, 8, 7000));
		
		
		//hr.printAll();
		// using old style functor design pattern: Create a class that implements the interface,
		// and than create an instance from that class, to pass to the calling printFilter....
		
		hr.printFilteredEmployees( new FilterEmployeeSeniority(), 10, 5);
		
		//using annon inner class - no need to write the implementing class anywhere. Yet need to override a method.
		
		hr.printFilteredEmployees( new FilterEmployee() {

				@Override
				public boolean accept(Employee e, int high, int low) {
					if (e.getSeniority() > low && e.getSeniority() < high){
						return true;
					}
					return false;}}, 10,5);
		
		// using lambda
		
		hr.printFilteredEmployees((Employee e, int high, int low)->  (e.getSeniority() > low && e.getSeniority() < high),10,5);
		
		// we can omit the types of paramters, as they are already known. Can also take off the parenthesis.
		hr.printFilteredEmployees(( e,  high,  low)->  e.getSeniority() > low && e.getSeniority() < high,10,5);

	}

}
