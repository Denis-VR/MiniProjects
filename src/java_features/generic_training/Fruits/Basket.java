package java_features.generic_training.Fruits;

import project_8_colletion_framework.realization.ArrayList;

public class Basket<T extends Fruit> {
    private ArrayList<T> list = new ArrayList<>();

    public double getBasketWeight() {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getWeight();
        }
        return sum;
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    public int compare(Basket<? extends Fruit> otherBasket) {
        if (this.getBasketWeight() > otherBasket.getBasketWeight()) {
            return 1;
        } else if (this.getBasketWeight() == otherBasket.getBasketWeight()) {
            return 0;
        } else {
            return -1;
        }
    }

    public int size() {
        return list.size();
    }

    public void transfer(Basket<? super Fruit> otherBasket) {
        for (int i = 0; i < this.size(); i++) {
            otherBasket.add(this.list.get(i));
        }
        this.list.clear();
    }
}
