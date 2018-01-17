package StudentAndGrades;

public interface Student {
	public int[] getGrades();

	default public int getEvarage(){
		int sum = 0;
		for (int g : getGrades()){
			sum += g;
		}
		if (getGrades() != null)
			return sum/getGrades().length;
		else return 0;
	}

	default boolean isExcellent(){
		return getEvarage() > 80;
	}


}
