package Ex6;
class NameTooShortException extends NameException
{
	public NameTooShortException() 	// default Ctor
	{
		super();
	}
	public NameTooShortException(String str) {	// ctor with a str
		super(str);
	}

	// We would like our Exception to give some indication 
	// Of the error occured, for example: what was the faulty name?
	public NameTooShortException(String str, String name) {
		super(str, name);
		
	}
};