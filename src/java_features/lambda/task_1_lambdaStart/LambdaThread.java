package java_features.lambda.task_1_lambdaStart;

public class LambdaThread {
    public static void main(String[] args) {

//        Worker worker = new Worker() {
//            @Override
//            public String work(int count) {
//                for (int i = 0; i < n; i++) {
//                    System.out.println("I'm working");
//                }
//                return "Success";
//            }
//        }
//        Director director = new Director();
//        String result = director.jobStart(worker, 5);
//        System.out.println(result);

        System.out.println(new Director().jobStart((n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println("I'm working");
            }
            return "Success";
        }, 5));

    }
}
