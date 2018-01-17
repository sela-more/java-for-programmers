package Basic;


public interface Income extends Salary {

	public int getIncome(int bonus);

	@Override
	default public int getPayCheck(){
		return getIncome(0);
	}	


}
