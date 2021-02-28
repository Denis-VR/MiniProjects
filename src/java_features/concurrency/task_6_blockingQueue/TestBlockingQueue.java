package java_features.concurrency.task_6_blockingQueue;

public class TestBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue blockingQueue = new BlockingQueue();

		new Thread(() -> {
			int counter = 0;
			while (true) {
				Runnable task = blockingQueue.take();
				if (task != null) {
					new Thread(task).start();
				}
				System.out.println(++counter);
			}
		}).start();

		for (int i = 0; i < 10; i++) {
			final int index = i;
			blockingQueue.add(() -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("---" + index);
			});
		}


	}
}
