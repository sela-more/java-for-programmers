package BasicExample;

public class FilterEmployeeSeniority implements FilterEmployee {

	@Override
	public boolean accept(Employee e, int high, int low) {
		if (e.getSeniority() > low && e.getSeniority() < high){
			return true;
		}
		return false;
	}


}
