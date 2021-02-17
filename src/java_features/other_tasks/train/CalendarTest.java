package java_features.other_tasks.train;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 15, 40);
        System.out.println(c.getTime());
        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("Новый час " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);
        System.out.println("Добавить 35 дней " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("Прокрутить 35 дней " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("Установить дату в 1 " + c.getTime());
    }
}
