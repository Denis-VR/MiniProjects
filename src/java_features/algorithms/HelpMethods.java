package java_features.algorithms;

public class HelpMethods {
	public static int[] getRandomArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}
}
