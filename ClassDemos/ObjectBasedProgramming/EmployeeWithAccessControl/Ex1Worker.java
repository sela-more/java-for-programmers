class Ex1Worker		// Class Name
{

	// Data Members
  private int m_nAge;		// Will discuss private and public later
  private int m_nSalary;

	// Methods
  public int getSalary() {
	return m_nSalary;
  }
  public int getAge() {
	return m_nAge;
  }
  public void setSalary(int salary) {
	m_nSalary = salary;	// m_ convention is more C++ but very readable
  }

  public void setAge(int age) {
	m_nAge = age;	// m_ convention is more C++ but very readable
  }
  
  

  /*public Worker(int age,int salary)
  {
    m_nAge    = age;
    m_nSalary = salary;
  }
  public Worker()
  {
    m_nAge    = 50;
    m_nSalary = 5000;
  } */
}
