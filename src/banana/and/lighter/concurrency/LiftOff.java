package banana.and.lighter.concurrency;

public class LiftOff implements Runnable {
	/**
	 * Impl Runnable Interface only define to name a task.
	 * Unless bind to a thread it will not have any thread ability
	 */

	private int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	public LiftOff() {}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "), ";
	}
	
	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(status());
			Thread.yield();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LiftOff lo = new LiftOff(13);
		lo.run();
	}

}