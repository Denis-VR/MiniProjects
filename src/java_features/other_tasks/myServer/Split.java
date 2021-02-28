package java_features.other_tasks.myServer;

public class Split {

	public static void main(String[] args) {
		String text = "Двадцать пять и шесть стаканов";
		String[] result = text.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
