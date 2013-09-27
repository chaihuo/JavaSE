package banana.and.lighter.concurrency.task;

import banana.and.lighter.concurrency.YieldTester;

public class BasicThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new YieldTester()).start();
		}
		System.out.println("Waiting for LiftOff");
	}

}
