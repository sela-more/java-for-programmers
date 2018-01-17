package LoginExceptionExample;

public class Users {
	 public static void checkPermit(String ID, String password) throws  
	 UnauthorizedException
{
 if (!(ID.equals("sarit") && password.equals("tamir")))

    throw new UnauthorizedException("Un authorized access attempt by",ID,password);
}

}
