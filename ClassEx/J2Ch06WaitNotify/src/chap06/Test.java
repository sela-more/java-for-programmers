package chap06;

public class Test {

	public static void main(String[] args) {
		
		int limit = Integer.parseInt(args[0]);
		int threadCount = Integer.parseInt(args[1]);
		
		Spooler spooler = new Spooler(limit);
		Thread[] threads = new Thread[threadCount];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new WritingTask(spooler, i+1));
		} 
		
		for (Thread thread : threads) {
			thread.start();
		}
		

	}

}
