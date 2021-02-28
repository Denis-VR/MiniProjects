package java_features.concurrency.task_5_executerService;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DifferentBetweenSingleThreadAndFixedThread {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
//        ExecutorService service = Executors.newFixedThreadPool(3);
		ExecutorService service = Executors.newSingleThreadExecutor();
		CountDownLatch count = new CountDownLatch(3);
		service.execute(new Runnable() {
			@Override
			public void run() {
				long sum = 0;
				for (int i = 0; i < 1000000; i++) {
					if (i % 2 == 0) {
						sum += i;
					}
				}
				System.out.println("Sum = " + sum);
				count.countDown();

			}
		});

		service.execute(new Runnable() {
			@Override
			public void run() {
				long sum = 0;
				for (int i = 0; i < 1000000; i++) {
					if (i % 7 == 0) {
						sum += i;
					}
				}
				System.out.println("Sum2 = " + sum);
				count.countDown();
			}
		});

		service.execute(new Runnable() {
			@Override
			public void run() {
				ArrayList<Integer> list = new ArrayList<>();
				int k = 0;
				for (int i = 0; i < 1000; i++) {
					list.add((int) (Math.random() * 1000));
				}
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) % 2 == 0) {
						k++;
					}
				}
				System.out.println("Even numbers: " + k);
				count.countDown();
			}
		});

		try {
			count.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long timeAfter = System.currentTimeMillis();

		System.out.println("Total time: " + (timeAfter - time));
		service.shutdown();
	}
}
