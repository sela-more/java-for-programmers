package OverridingObjectMethodsDemo.isInstanceProblem;



class Main {
	public static void main(String args[])
	{
		// Check how toString works
		SpecialObject SObject1 = new SpecialObject("Special 1");
		
		
		// Checking instanceof Vs. getClass
		// first round: use instanceof
		SpecialObjectSon sOS = new SpecialObjectSon("Special 1", 11);

		if (SObject1.equals(sOS))
			// note implecit usage of toString()
			System.out.println("Objects are equal: " + SObject1 + " " + sOS);
		else
			System.out.println("Objects are NOT equal: " + SObject1 + " " + sOS);

		
		// but now try Visa versa
		if (sOS.equals(SObject1))
			// note implecit usage of toString()
			System.out.println("Objects are equal: " + SObject1 + " " + sOS);
		else
			System.out.println("Objects are NOT equal: " + SObject1 + " " + sOS);

		
	


	}

}