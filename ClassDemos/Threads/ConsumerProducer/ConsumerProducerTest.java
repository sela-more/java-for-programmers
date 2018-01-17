package ConsumerProducer;

public class ConsumerProducerTest {
    public static void main(String[] args) {
        Basket c = new Basket();
        Producer p1 = new Producer(c);
        Consumer c1 = new Consumer(c);

        p1.start();
        c1.start();
    }
}
