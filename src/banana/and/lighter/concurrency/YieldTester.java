package banana.and.lighter.concurrency;

public class YieldTester implements Runnable {

	public YieldTester() {
		System.out.println("Construct begin!");
	}
	
	@Override
	public void run() {
		System.out.println("One");
		Thread.yield();
		System.out.println("Two");
		Thread.yield();
		System.out.println("Three");
		Thread.yield();
		System.out.println("Mission completed!");
	}

}
