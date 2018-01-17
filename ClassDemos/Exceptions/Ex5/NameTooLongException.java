package Ex5;
class NameTooLongException extends NameException
{
	public NameTooLongException() 	// default Ctor
	{
		super();
	}
	public NameTooLongException(String str) {	// ctor with a str
		super(str);
	}

	// We would like our Exception to give some indication 
	// Of the error occured, for example: what was the faulty name?
	public NameTooLongException(String str, String name) {
		super(str, name);
		
	}
	
};