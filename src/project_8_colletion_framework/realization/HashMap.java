package project_8_colletion_framework.realization;

import project_8_colletion_framework.Interfaces.Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMap<K, V> implements Map<K, V> {
    private Object[] array = new Object[INITIAL_CAPACITY];
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private int size = 0;


    @Override
    public void put(K key, V value) {
        if (size >= array.length * LOAD_FACTOR) {
            increaseArray();
        }
        if (put(key, value, array)) {
            size++;
        }
        ;
    }

    @Override
    public V get(K key) {
        int position = getElementPosition(key, array.length);
        Entry existedElement = (Entry) array[position];
        while (existedElement != null) {
            if (existedElement.key.equals(key)) {
                return existedElement.value;
            }
            existedElement = existedElement.next;
        }
        return null;
    }

    @Override
    public Set<K> keySet() {
        Set<K> resutl = new HashSet<>();
        for (Object entry : array) {
            Entry existedElement = (Entry) entry;
            while (existedElement != null) {
                resutl.add(existedElement.key);
                existedElement = existedElement.next;
            }
        }
        return resutl;
    }

    @Override
    public List<V> values() {
        List<V> resutl = new ArrayList<>();
        for (Object entry : array) {
            Entry existedElement = (Entry) entry;
            while (existedElement != null) {
                resutl.add(existedElement.value);
                existedElement = existedElement.next;
            }
        }
        return resutl;
    }

    @Override
    public boolean remove(K key) {
        int position = getElementPosition(key, array.length);
        Entry existedElement = (Entry) array[position];
        if (existedElement != null && existedElement.key.equals(key)) {
            array[position] = existedElement.next;
            size--;
            return true;
        } else {
            while (existedElement != null) {
                Entry nextElement = existedElement.next;
                if (nextElement == null) {
                    return false;
                }
                if (nextElement.key.equals(key)) {
                    existedElement.next = nextElement.next;
                }
                existedElement = existedElement.next;
            }
        }

        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void increaseArray() {
        Object[] newArray = new Object[array.length * 2];
        for (Object entry : array) {
            Entry existedElement = (Entry) entry;
            while (existedElement != null) {
                put(existedElement.key, existedElement.value, newArray);
                existedElement = existedElement.next;
            }
        }
        array = newArray;
    }

    public boolean put(K key, V value, Object[] dst) {
        int position = getElementPosition(key, dst.length);
        Entry existedElement = (Entry) dst[position];
        if (existedElement == null) {
            Entry entry = new Entry(key, value, null);
            dst[position] = entry;
            return true;
        } else {
            while (true) {
                if (existedElement.key.equals(key)) {
                    existedElement.value = value;
                    return false;
                }
                if (existedElement.next == null) {
                    existedElement.next = new Entry(key, value, null);
                    return true;
                }
                existedElement = existedElement.next;
            }
        }
    }

    private int getElementPosition(K carOwner, int arrayLength) {
        return Math.abs(carOwner.hashCode() % arrayLength);
    }

    private class Entry {
        private K key;
        private V value;
        private Entry next;

        public Entry(K key, V value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
