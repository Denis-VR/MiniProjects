package java_features.inheritance.task_1_zoo;

final public class Dog extends Canine implements Pet, Dead {


    public Dog(int energy, int age, String noise, String name) {
        super(energy, age, noise, name);
    }

    public Dog() {

    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " одомашен(а)");
    }

    @Override
    public void play(Animal animal) {
        System.out.println(getName() + " играет c " + animal.getName() + "...");
        if (getEnergy() > animal.getEnergy()) {
            System.out.println(getName() + " побеждает!");
        } else {
            System.out.println(animal.getName() + " побеждает!");
        }
    }

    @Override
    public void dead() {
        System.out.println(getName() + " сдох...");
        setName("мертвец " + getName());
    }
}
