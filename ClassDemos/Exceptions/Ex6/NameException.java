package Ex6;
class NameException extends Exception
{
	String m_name = "No Name Given";

	public NameException() 	// default Ctor
	{
		super();
	}
	public NameException(String str) {	// ctor with a str
		super(str);
	}

	// We would like our Exception to give some indication 
	// Of the error occured, for example: what was the faulty name?
	public NameException(String str, String name) {
		super(str);
		m_name = name;
	}
	public String getFaultName() {
		return m_name;
	}
};