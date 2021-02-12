package java_features.mini_tasks.javaRushTest.task1527;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        String input = "4+5+2";
        int sum = 0;
        String[] vars = input.split("\\+");
        for (int i = 0; i < vars.length; i++) {
            sum += Integer.parseInt(vars[i]);
        }
        System.out.println(sum);
    }

}
