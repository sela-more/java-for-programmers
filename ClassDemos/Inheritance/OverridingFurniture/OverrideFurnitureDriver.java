package OverridingFurniture;

public class OverrideFurnitureDriver {

	
	public static void main(String[] args) {
		Furniture f = new Chair();
	    f.setPrice(5);
	    //f.setClubMember(true); // function available for chairs only

	    
	    Chair c = (Chair)f;
	    c.setClubMember(true); // function available for chairs only



	}

}
