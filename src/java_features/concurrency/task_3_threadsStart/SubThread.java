package java_features.concurrency.task_3_threadsStart;

public class SubThread extends Thread {
	@Override
	public void run() {
		System.out.println("Start Subsidiary Thread");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " (Sub Thread)");
		}
		System.out.println("Finish Subsidiary Thread");
	}
}
