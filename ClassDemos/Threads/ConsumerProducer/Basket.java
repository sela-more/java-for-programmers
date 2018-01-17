package ConsumerProducer;

public class Basket {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
    	while (available == false) {
            try {
                wait(); // Until the producer wakes me up
            } catch (InterruptedException e) { }
        }
        return contents;

    }

    public synchronized void put(int value) {
    	while (available == true) {
            try {
                wait(); // Until the consumer wakes me up
            } catch (InterruptedException e) { }
        }
        contents = value;

    }
    
    public void changeState(boolean _state) {
		available=_state;
    }

}
