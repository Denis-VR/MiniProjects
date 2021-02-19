package java_features.collections.some_tasks;

import java_features.collections.some_tasks.help_classes.Animal;
import java_features.collections.some_tasks.help_classes.Cat;
import java_features.collections.some_tasks.help_classes.Dog;

import java.util.ArrayList;

public class Test {


    public <T extends Animal> void getSound(ArrayList<T> list) {
        list.get(0).sound();
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Cat());

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

//        new Shit().getSound(animals);
//        new Shit().getSound(dogs);

        new Test().takeSound(animals);
        new Test().takeSound(dogs);
    }

    public void takeSound(ArrayList<? extends Animal> animals) { // тоже, что и getSound
        animals.get(0).sound();
    }

    public class MyList<E> {
        public void add(E o) {
        }
    }
}
