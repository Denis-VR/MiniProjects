package java_features.other_tasks.people;

abstract public class Car {
    private String name;
    private int age;

    public Car(String name) {
        this.name = name;
        age = 777;
    }

    public Car(int age) {
        this.age = age;
        this.age = 777;
    }

    public Car() {

    }

    public int getAge() {
        return age;
    }

}
