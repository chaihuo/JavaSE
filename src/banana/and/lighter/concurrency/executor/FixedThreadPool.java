package banana.and.lighter.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import banana.and.lighter.concurrency.task.LiftOff;

public class FixedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}

}
