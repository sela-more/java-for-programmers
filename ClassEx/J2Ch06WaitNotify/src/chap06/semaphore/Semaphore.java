package chap06.semaphore;
public class Semaphore {
    private int counter;

    public Semaphore() {
        this(0);
    }

    public Semaphore(int i) {
        if (i < 0) throw new IllegalArgumentException(i + " < 0");
        counter = i;
        System.out.println("(Semaphore created. Initial size=" + counter + ")");
    }

    public synchronized void release() {
        if (counter == 0) {
            this.notify();
        }
        counter++;
        System.out.println("(Semaphore released and now equals " + counter + ")");
    }



    public synchronized void acquire() throws InterruptedException {
        while (counter == 0) {
            this.wait();
        }
        counter--;

//        slp(100);// For printing reasons only
        System.out.println("(Semaphore acquired and now equals " + counter + ")");
    }



	public void slp(int duration) {
		try {
			Thread.sleep(duration);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}

