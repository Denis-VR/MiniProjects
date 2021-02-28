package java_features.other_tasks.train;

import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImport {
	static {
		out.println("Hello!");
	}

	public static void main(String[] args) {
		out.println("sqrt " + sqrt(9));
		out.println("tan " + tan(60));
	}

}
