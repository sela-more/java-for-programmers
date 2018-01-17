package BasicInheritance;
public class Parent {
	private int m_privateMember;
	public int m_publicMember;
	int m_packageMember;
	protected int m_protectedMember;
	
	public void setPrivate(int data){
		this.m_privateMember = data;
	}
	
	public void overrideMe(){
		System.out.println("In parent");
	}

}
