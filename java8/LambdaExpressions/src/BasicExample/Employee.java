package BasicExample;


public class Employee {
	
	private String _name;
	private Gender _gender;
	private int _seniority;
	private int _sallary;
	public Employee(String name, Gender gender, int seniority, int sallary) {
		super();
		this._name = name;
		this._gender = gender;
		this._seniority = seniority;
		this._sallary = sallary;
	}
	
	
	public int getSeniority() {
		return _seniority;
	}
	public void setSeniority(int seniority) {
		this._seniority = seniority;
	}
	public int getSallary() {
		return _sallary;
	}
	public void setSallary(int sallary) {
		this._sallary = sallary;
	}
	public String getName() {
		return _name;
	}
	public Gender getGender() {
		return _gender;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_gender == null) ? 0 : 	_gender.hashCode());
		result = prime * result + ((_name == null) ? 0 : 	_name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Employee [name=" + _name + "]";
	}
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



}
