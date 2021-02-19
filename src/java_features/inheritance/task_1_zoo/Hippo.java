package java_features.inheritance.task_1_zoo;

public class Hippo extends Animal {


    public Hippo(int energy, int age, String noise, String name) {
        //super(energy, age, noise, name);
        System.out.println("обект инициализирован без состояния");
    }

    @Override
    public void makeNoise() {
        //super.makeNoise();
        System.out.println("Объект " + getClass().getSimpleName() + " переопределил метод и издал звук: " + getNoise());
    }

    public void hippoTest() {
        System.out.println("-----------------------------------------------");
        System.out.println("Запус старого метода: ");
        super.makeNoise();
        System.out.println("Запущен метод, которым был расширен класс Hippo");
        System.out.println("-----------------------------------------------");
    }
}
