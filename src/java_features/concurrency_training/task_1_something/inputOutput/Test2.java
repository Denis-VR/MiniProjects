package java_features.concurrency_training.task_1_something.inputOutput;

public class Test2 {
    public static void main(String[] args) {
//        String text = "My\ntext";
//        StringBuilder builder = new StringBuilder(text);
//        builder.append(". Hello,\nit's a new text!");
//        System.out.println(builder);

        int k = 435;
        String t = String.valueOf(k);
        System.out.println(t);

        StringBuilder build = new StringBuilder(String.valueOf(425));
        System.out.println(build);

    }
}
