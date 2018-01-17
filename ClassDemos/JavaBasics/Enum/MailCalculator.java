package Enum;

public class MailCalculator {
	enum Mail {
	    AIR(15), 
	    GROUND(10), 
	    SEA(5);

	    private final int m_costPerKg;
	    Mail(int costPerKg){
	      m_costPerKg = costPerKg;
	    }
	    public int costPerKg(){
	      return m_costPerKg;
	    }
	  }
	  public static void main(String[] args) {
	    int weight = Integer.parseInt(args[0]);   
	    for (Mail mail : Mail.values())
	      System.out.println(mail + " shipment cost of " + 
	          weight + "kg : "  + mail.costPerKg() * weight);
	  }

}
