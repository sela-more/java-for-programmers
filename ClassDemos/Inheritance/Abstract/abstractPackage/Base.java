package Abstract.abstractPackage;
abstract class Base
{
	int m_value;	// real data member
	public Base(int value) 	// real cotr
	{
		m_value = value;
	}
	public int getValue()
	{
		return m_value;
	}

	// defining an abstract method makes the whole class abstract
	// in this case, we need a special description for each derive
	// to what is the value.
	abstract public void describeTheValue();
}