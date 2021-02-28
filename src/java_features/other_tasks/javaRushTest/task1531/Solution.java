package java_features.other_tasks.javaRushTest.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(reader.readLine());
		reader.close();

		System.out.println(factorial(input));
	}

	public static String factorial(int n) {
		//add your code here
		String value = null;
		BigInteger bInt = BigInteger.valueOf(1);
		if (n < 0) value = "0";
		else {
			for (int i = 1; i <= n; i++) {
				BigInteger b = BigInteger.valueOf(i);
				bInt = bInt.multiply(b);
			}
			value = bInt.toString();
		}
		return value;
	}
}
