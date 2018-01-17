package CamelAndZebra;

public class Camel implements Runnable {
    public void run() {
        while(Sync.counter++<100) {
        	
        	//first version: no sync
        	//synchronized(Sync.monitor)  {
        		System.out.print("Ca");
        		System.out.print("mel   ");
        	//}
	    }
    }
}
