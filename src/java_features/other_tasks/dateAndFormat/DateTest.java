package java_features.other_tasks.dateAndFormat;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println(String.format("%tc", new Date()));
		System.out.println(String.format("%tr", new Date()));
		System.out.println(String.format("%tA, %<td %<tB", new Date()));
	}
}
