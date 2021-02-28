package java_features.concurrency.task_5_executerService;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTraining {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);


		CountDownLatch countDownLatch = new CountDownLatch(10);

		for (int i = 0; i < 10; i++) {
			final int index = i;
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("Start - " + index);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("finish - " + index);
					countDownLatch.countDown();
				}
			});
		}

		countDownLatch.await();
		System.out.println("All!1");
	}
}
