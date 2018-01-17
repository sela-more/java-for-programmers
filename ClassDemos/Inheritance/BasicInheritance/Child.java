package BasicInheritance;
class Child	extends Parent{
	private int m_child;
	public void chhildfunc() {
		this.m_packageMember = 5;
		this.m_protectedMember = 6;
		this.m_publicMember = 7;
		//this.m_privateMember = 8;
		this.setPrivate(6); // parent method, public,
							// allows setthing the private member
		
		
	}
	
	public void overrideMe(){
		chhildfunc();
		System.out.println("child is: " + this.m_child);
		System.out.println("In Child");
	}
	
}