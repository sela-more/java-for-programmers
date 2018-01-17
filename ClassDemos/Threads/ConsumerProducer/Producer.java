package ConsumerProducer;

public class Producer extends Thread {
    private Basket theBasket;

    public Producer(Basket c) {
        theBasket = c;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Producer put: " + i);
            theBasket.put(i);
            synchronized(theBasket) {
       		 	theBasket.changeState(true);
       		 	theBasket.notify(); // Wake the consumer up
       	     }
             try {
                sleep((int)(Math.random() * 100));
             } catch (InterruptedException e) { }

        }
    }
}
