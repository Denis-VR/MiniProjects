package java_features.inheritance.task_1_zoo;

abstract public class Feline extends Animal implements Pet {
    public Feline(int energy, int age, String noise, String name) {
        super(energy, age, noise, name);
    }

    public Feline(String name) {
        super(name);
        System.out.println("Создание обьекта Feline с именем.");
    }
}
