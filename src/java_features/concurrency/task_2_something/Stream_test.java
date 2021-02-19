package java_features.concurrency.task_2_something;

public class Stream_test {
    static boolean win = false;

    public static void main(String[] args) throws InterruptedException {
        int random = (int) (Math.random() * 1000000000);
        System.out.println(random);
        Thread timer = new Thread(() -> {
            int i = 0;
            try {
                while (!win) {
                    System.out.println(i);
                    i++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    int guessNumber = (int) (Math.random() * 1000000000);
                    if (guessNumber == random) {
                        win = true;
                        System.out.println(guessNumber);
                    }
                }
            }
        });
    }
}