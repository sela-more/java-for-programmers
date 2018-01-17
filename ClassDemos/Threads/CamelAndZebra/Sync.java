package CamelAndZebra;

public class Sync {
	static int counter=0;
	static String monitor = "Stam";

    public static void main(String[] args) {
        Thread zeb = new Thread(new Zebra());
        Thread cam = new Thread(new Camel());

        zeb.start();
        cam.start();
 	}

}
