package OverridingObjectMethodsDemo.equalsAndhashCode;

class Main {
	public static void main(String args[])
	{
		// Check how toString works
		SpecialObject SObject1 = new SpecialObject("Special 1");
		System.out.println(SObject1);

		// Check equals and hashCode
		SpecialObject SObject2 = new SpecialObject("Special 2");
		SpecialObject SObject3 = new SpecialObject("Special 1");


		
		// check two objects that should be equal
		// first: with neither equal and hashCode implemented:
		// objects will NOT be equal although they are logically equal

		// Second round: both hashCode and equal. Once you do one, 
		// you have to do both, otherwise some algorithms will not
		// work properly!
		if (SObject1.equals(SObject3))
			// note implecit usage of toString()
			System.out.println("Objects are equal: " + SObject1 + " " + SObject3);
		else
			System.out.println("Objects are NOT equal: " + SObject1 + " " + SObject3);


		// objects should be different
		if (SObject1.equals(SObject2))
			// note implecit usage of toString()
			System.out.println("Objects are equal: " + SObject1 + " " + SObject2);
		else
			System.out.println("Objects are NOT equal: " + SObject1 + " " + SObject2);



	}

}