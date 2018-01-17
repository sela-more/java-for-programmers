package LoginExceptionExample;

public class UnauthorizedException extends Exception
{
	   private String m_sPassword,m_sID;
	   public UnauthorizedException()   { }   
	   public UnauthorizedException(String str)
	   {
	     super(str);
	   }
	   public UnauthorizedException(String str,String ID,String password)
	   {
	     super(str);
	     m_sID = ID;
	     m_sPassword = password;
	   }
	   public String getIntruder()
	   {
	     return (" ID=" + m_sID + " Password=" + m_sPassword);
	   }
	
}
