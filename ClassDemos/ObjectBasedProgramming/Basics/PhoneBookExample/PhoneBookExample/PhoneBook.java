package PhoneBookExample;
class PhoneBook
{
	Person arr[] = new Person[100];
	
	int nNumOfPersons = 0;

	void addPerson(Person p) //param0 -> this (PhoneBook), 
							 //Person p 
	{
		if (nNumOfPersons < arr.length)
		{
			arr[nNumOfPersons++] = p;
		}
	}

	void print()
	{
		System.out.println("Num of persons in book = " 
			+ nNumOfPersons);
		for (int i = 0 ; i < nNumOfPersons ; ++i )
		{
			Person personToPrint = arr[i];
			personToPrint.print();
			//arr[i].print();
		}
	}
};