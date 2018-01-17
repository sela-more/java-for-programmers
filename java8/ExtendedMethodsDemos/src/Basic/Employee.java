package Basic;


public class Employee implements Income {

	
	private int _paycheck;
	public Employee(int paycheck) {
		super();
		this._paycheck = paycheck;
	}

	
	@Override
	public int getIncome(int bonus) {
		return _paycheck + bonus;

	}
	
	

}
