package Enum;

public class EnumExample {
	enum Mail{AIR, GROUND, SEA}
	  public static void main(String[] args) {
	    Mail[] values = Mail.values();
	    for(Mail mail : values)
	      System.out.println(mail);
	  }

}
