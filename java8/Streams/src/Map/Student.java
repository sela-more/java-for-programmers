package Map;

import java.util.stream.Stream;

public class Student {
	
	private String _name;
	private int _average;
	public Student(String name) {
		super();
		this._name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (_name == null) {
			if (other._name != null)
				return false;
			} else if (!_name.equals(other._name))
				return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + _name + "] " + getAverage();
	}
	public int getAverage() {
		return _average;
	}
	public Student setAverage(int average) {
		this._average = average;
		return this;
	}
	public String getName() {
		return _name;
	}
	public static void main(String[] args) {
		Stream<Student> students = Stream.of(new Student("moshe"), new Student("david"), 
			new Student("dani"));
		Object[] objects = students.map((s)->s.setAverage(s.getAverage() 
			+ 70)).toArray();
		Stream.of(objects).forEach((s)->System.out.println(s));

	}




}
