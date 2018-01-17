package chap06;

import chap06.semaphore.Semaphore;

public class Spooler {
	
	private Semaphore semaphore;	
	
	public Spooler(int count) {
		this.semaphore = new Semaphore(count);
	}

	public void println(String s) throws InterruptedException {
		semaphore.acquire();
		Thread.sleep((int) Math.random() * 100 + 300);
		System.out.println(s);
		semaphore.release();
	}
}
