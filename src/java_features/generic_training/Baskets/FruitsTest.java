package java_features.generic_training.Baskets;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FruitsTest {
    public Basket<Orange> oranges;
    public Basket<Apple> apples;
    public Basket<Fruit> fruits;

    @Before
    public void init() {
        oranges = new Basket<>();
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
        }

        apples = new Basket<>();
        for (int i = 0; i < 10; i++) {
            apples.add(new Apple());
        }

        fruits = new Basket<>();
        for (int i = 0; i < 5; i++) {
            fruits.add(new Orange());
            fruits.add(new Apple());
        }
    }

    @Test
    public void whenFruitsReturnTheirWeight() {
        Orange orange = new Orange();
        Apple apple = new Apple();

        assertEquals(1, apple.getWeight(), 0.0001);
        assertEquals(1.5, orange.getWeight(), 0.00001);
    }

    @Test
    public void addFruitToBasket() {
        Basket<Fruit> basket = new Basket<>();
        basket.add(new Orange());
        basket.add(new Apple());
        basket.add(new Orange());
        assertEquals(3, basket.size());
    }

    @Test
    public void getBasketWeightTest() {
        assertEquals(15, oranges.getBasketWeight(), 0.0001);
        assertEquals(10, apples.getBasketWeight(), 0.0001);
        assertEquals(5+(1.5*5), fruits.getBasketWeight(), 0.0001);
    }

    @Test
    public void compareTest() {
        assertEquals(1, oranges.compare(apples));
        assertEquals(0, oranges.compare(oranges));
        assertEquals(1, oranges.compare(fruits));

        assertEquals(-1, apples.compare(fruits));
        assertEquals(-1, apples.compare(oranges));

        assertEquals(1,fruits.compare(apples));
        assertEquals(-1,fruits.compare(oranges));
    }

    @Test
    public void transferTest() {
        Basket<Fruit> otherFruits = new Basket<>();
        oranges.transfer(otherFruits);
        assertEquals(0, oranges.size());
        assertEquals(10, otherFruits.size());


        apples.transfer(otherFruits);
        assertEquals(20, otherFruits.size());

        Basket<Orange> oranges2 = new Basket<>();
        for (int i = 0; i < 5; i++) {
            oranges2.add(new Orange());
        }

        oranges2.transfer(oranges);
        assertEquals(5, oranges.size());
    }

    @Test
    public void staticTransferTest() {
        Basket.transfer(apples, fruits);
        assertEquals(20, fruits.size());

        Basket<Orange> oranges2 = new Basket<>();
        Basket.transfer(oranges, oranges2);
        assertEquals(0, oranges.size());
        assertEquals(10, oranges2.size());
    }

}