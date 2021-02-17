package project_8_colletion_framework.realizations;

import project_8_colletion_framework.Interfaces.Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashSet<T> implements Set<T> {

    private Map<T, Object> map = new HashMap<>();
    private Object object = new Object();


    @Override
    public boolean add(T car) {
        if (map.containsKey(car)) {
            return false;
        }
        map.put(car, object);
        return true;
    }

    @Override
    public boolean remove(T car) {
        Object removed = map.remove(car);
        return removed != null;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void clear() {

        map.clear();
    }

    @Override
    public boolean contains(T car) {

        return map.containsKey(car);
    }

    @Override
    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

}
