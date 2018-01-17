package OverridingFurniture;

public class Chair extends Furniture {
	
	  	private int 	 m_legs;
	  	private boolean m_upholstery;
	  	private boolean m_clubMember;
	  
	  
	  	// override example. Note: since parent members are private, 
	  	// I use set method instead.
	  	public void setPrice(int price) {
	  		System.out.println("Inside chair setPrice");
	  		if (m_clubMember)
	  			super.setPrice(price-10);
	  		else
	  			super.setPrice(price);
	  	}
	  	public Chair()
	    {   
	       super("wood"); // Call the parent’s Ctor
	       System.out.println("Inside chair constructor");
	    }
		public boolean isClubMember() {
			return m_clubMember;
		}
		public void setClubMember(boolean member) {
			m_clubMember = member;
		}


}
