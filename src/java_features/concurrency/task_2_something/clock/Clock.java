package java_features.concurrency.task_2_something.clock;

class Clock implements Runnable {
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Tik");

			if (!ClockManager.isClockRun) return;
		}
	}
}
