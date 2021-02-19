package java_features.generics.task_2_baskets;

import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public double getBasketWeight() {
        double sum = 0;
        for (int i = 0; i < fruits.size(); i++) {
            sum += fruits.get(i).getWeight();
        }
        return sum;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int compare(Basket<?> otherBasket) {
        return Double.compare(this.getBasketWeight(), otherBasket.getBasketWeight());
    }

    public int size() {
        return fruits.size();
    }

    public void transfer(Basket<? super T> otherBasket) {
        for (int i = 0; i < this.size(); i++) {
            otherBasket.add(this.fruits.get(i));
        }
        this.fruits.clear();
    }

    public static <U extends Fruit> void transfer(Basket<? extends U> src, Basket<? super U> dst) {
        dst.fruits.addAll(src.fruits);
        src.fruits.clear();
    }
}
