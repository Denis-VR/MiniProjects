package java_features.junit_training;

//This is a simple calculator, that needs to be tested.
public class Calculator {
    public static void main(String[] args) {
        double a = 0;
        for (int i = 0; i < 100; i++) {
            a += 0.01;
        }
        System.out.println(a);
    }

    int plus(int a, int b) {
        return a + b;
    }

    int plus(String a, String b) {
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        return aa + bb;
    }

    int minus(int a, int b) {
        return a - b;
    }

    double mult(double a, double b) {
        return a * b;
    }

    int qrt(int a) {
        return a * a;
    }
}
