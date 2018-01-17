package PhoneBookExample;
class Application
{
	public static void main(String args[])
	{
		PhoneBook book = new PhoneBook();
		Person p = new Person();
		p.setPhoneNumber("03-6543215");
		p.setName("Goofee");
		book.addPerson(p);
		book.addPerson(p);
		Person p2 = new Person();
		p2.setPhoneNumber("03-1111111");
		p2.setName("Goofee 2");
		book.addPerson(p2);
		book.print();
		PhoneBook book2 = new PhoneBook();
		book2.addPerson(p);

		//addPerson(PhoneBook, Person)
	}
};