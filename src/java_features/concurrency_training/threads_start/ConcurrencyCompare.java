package java_features.concurrency_training.threads_start;

import java.util.Arrays;

public class ConcurrencyCompare {
    static final int n = 10_000_000;
//    static final int n = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread timer = new Thread(new Timer());
        timer.setDaemon(true);
        timer.start();
        System.out.println(withoutConcurrency());
        System.out.println(witchConcurrency());

    }

    public static String withoutConcurrency() {
        long beforeTime = System.currentTimeMillis();

        float[] floats = new float[n];
        Arrays.fill(floats, 1);
        for (int i = 0; i < floats.length; i++) {
            float f = (float) i;
            floats[i] = (float) (floats[i] * Math.sin(0.2f + f / 5)
                    * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
        }

        return "withoutConcurrency() - " + (System.currentTimeMillis() - beforeTime);
    }

    public static String witchConcurrency() throws InterruptedException {
        long beforeTime = System.currentTimeMillis();

        float[] floats = new float[n];
        Arrays.fill(floats, 1);
        float[] floats1 = new float[n / 2];
        float[] floats2 = new float[n / 2];
        System.arraycopy(floats, 0, floats1, 0, n / 2);
        System.arraycopy(floats, n / 2, floats2, 0, n / 2);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < floats1.length; i++) {
                    float f = (float) i;
                    floats1[i] = (float) (floats1[i] * Math.sin(0.2f + f / 5)
                            * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
                }
            }
        });
        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < floats2.length; i++) {
                    float f = (float) i;
                    floats2[i] = (float) (floats2[i] * Math.sin(0.2f + f / 5)
                            * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
                }
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();
        System.arraycopy(floats1,0, floats, 0, floats1.length);
        System.arraycopy(floats2,0, floats, floats1.length, floats1.length);

        return "withConcurrency() - " + (System.currentTimeMillis() - beforeTime);
    }


}
