package StudentAndGrades;

public class StudentImpl implements Student {

	private int[] _grades;

	public StudentImpl(int[] grades) {
		super();
		this._grades = grades;
	}

	@Override
	public int[] getGrades() {
		return _grades;
	}

	public static void main(String[] args) {
		Student s = new StudentImpl(new int[] {90, 75, 85, 90, 100});
		if (s.isExcellent()){
			System.out.println(s.getEvarage());
		}
	}
}

