package java_features.oop_training.task_1_zoo;

public class Cat extends Feline {
    boolean wantMilk = true;

    public Cat(int energy, int age, String noise, String name) {
        super(energy, age, noise, name);
    }

    public Cat(String name) {
        super(name);
        System.out.println("Создание объекта Cat с именем");
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " одомашен(а)");
    }

    @Override
    public void play(Animal animal) {
        System.out.println("Игра не реализована для " + getClass().getSimpleName());
    }
}
