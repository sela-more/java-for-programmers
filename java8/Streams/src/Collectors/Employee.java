package Collectors;


public class Employee {
	
	private String name;
	private Gender gender;
	private int seniority;
	private int sallary;
	public Employee(String name, Gender gender, int seniority, int sallary) {
		super();
		this.name = name;
		this.gender = gender;
		this.seniority = seniority;
		this.sallary = sallary;
	}
	
	
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	public int getSallary() {
		return sallary;
	}
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((gender == null) ? 0 : 	gender.hashCode());
		result = prime * result + ((name == null) ? 0 : 	name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
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
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



}
