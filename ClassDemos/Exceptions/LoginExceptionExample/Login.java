package LoginExceptionExample;

public class Login {
	public static void main(String args[])  {
	    Login login = new Login(args);
	  }

	  public Login(String details[])  {
	     if (details.length !=2)
	        System.exit(-1);
	     try
	     {
	       Users.checkPermit(details[0],details[1]);
	     }
	     catch(UnauthorizedException u)
	     {
	        System.out.println(u + u.getIntruder());
	     }
	  }

}
