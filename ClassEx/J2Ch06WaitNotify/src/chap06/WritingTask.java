package chap06;

public class WritingTask implements Runnable {

	@Override
	public void run() {
		while(true) {
			try {
				spooler.println("Task: " + taskNo + "...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}

	private Spooler spooler;
	private int taskNo;

	public WritingTask(Spooler spooler, int taskNo) {
		this.spooler = spooler;
		this.taskNo = taskNo;
	}


}
