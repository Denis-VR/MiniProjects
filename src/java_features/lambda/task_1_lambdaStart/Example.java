package java_features.lambda.task_1_lambdaStart;

public class Example {
    public static void main(String[] args) {

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.print(1);
//            }
//        }).start();

        new Thread(() -> System.out.print(1)).start();
    }
}
