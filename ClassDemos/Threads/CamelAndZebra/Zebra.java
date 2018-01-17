package CamelAndZebra;

public class Zebra implements Runnable {
	Object o = new Object();
    public void run() {
        while(Sync.counter++<100) {
        	
        	//first version: no sync. Second: remove comments for Zebra and Camel  - lock on same monitor.
        	//synchronized (Sync.monitor) {
	            System.out.print("Ze");
	            System.out.print("bra   ");				
			//}
	    }
    }
}

