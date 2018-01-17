package chap04.generics;


public class Director extends Employee {

	public Director(String name, String position, int seniority) {
		super(name, position, seniority);
	}

	public Director(String name, String position, int seniority, int id) {
		super(name, position, seniority, id);
	}

	@Override
	public void printEmployee() {
		System.out.print("DIRECTOR: ");
		super.printEmployee();
	}

	
	
}
