package java_features.inheritance.task_1_zoo;

abstract public class Animal {
    private int energy;
    private int age;
    private String noise;
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        System.out.println("Создание объекта Animal с именем.");
        this.name = name;
    }

    public String getNoise() {
        return noise;
    }

    public Animal(int energy, int age, String noise, String name) {
        this.energy = energy;
        this.age = age;
        this.noise = noise;
        this.name = name;
        System.out.println("Создан объект " + getName() + " класса " + getClass().getSimpleName());
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeNoise() {
        System.out.println("Объект " + getName() + " издает звук: " + noise);
    }

    public void sleep() {
        if (energy < 30) {
            System.out.println("Объект " + getName() + " уснул крепким сном");
            energy = 100;
        } else System.out.println("Объект " + getName() + " не хочет спать");
    }

    public void roam() {
        System.out.println("Объект " + getName() + " гуляет по лакации");
    }

    private void say() {
        System.out.println("Запущен приватный метод");
    }

    public void sayPu() {
        say();
        System.out.println("Доступ к приватному методы был получен");
    }

    public void sayPu(String n) {
        System.out.println("Перезагрузка!");
    }

    @Override
    public String toString() {
        String text = "Объект " + getName();
        return text;
    }
}
