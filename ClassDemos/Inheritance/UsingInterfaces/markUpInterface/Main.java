package UsingInterfaces.markUpInterface;
class Main {

	public static void main(String args[])
	{
		Member mem = new Member();
		NonMember noMem = new NonMember();
		
		if (mem instanceof MySet)
			System.out.println("mem is a member");
		else
			System.out.println("mem is NOT a member");


		if (noMem instanceof MySet)
			System.out.println("noMem is a member");
		else
			System.out.println("noMem is NOT a member");


	}
}