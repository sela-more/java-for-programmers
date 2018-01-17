
public class RunnableExample implements Runnable{

	private String name;
	
	
	public RunnableExample(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new RunnableExample("Michal"), "Haim");
		//t.setDaemon(true);
		t.start();
		System.out.println("running in main");
//		t.join();
		System.out.println("finish main");

	}

	@Override
	public void run() {
		System.out.println("running in new thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("and my name is " + name);
		
	}

}
