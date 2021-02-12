package java_features.collections_training;

import java_features.collections_training.help_classes.*;

import java.util.ArrayList;

public class Shit {


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

        new Shit().takeSound(animals);
        new Shit().takeSound(dogs);
    }

    public void takeSound(ArrayList<? extends Animal> animals) { // тоже, что и getSound
        animals.get(0).sound();
    }

    public class MyList<E> {
        public void add(E o) {
        }
    }
}
