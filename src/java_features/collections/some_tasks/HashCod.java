package java_features.collections.some_tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashCod implements Comparable<HashCod> {
    //private static int id;
    //private int number;
    private String name;

    HashCod() {
    }

    HashCod(String name) {
        this.name = name;
        //id++;
        //number = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "/" + hashCode(); //+ "/" + id;
    }

    public static void main(String[] args) {
        HashCod cod1 = new HashCod();
        HashCod cod2 = cod1;

        //System.out.println(cod1==cod2);          //true
        //System.out.println(cod1.equals(cod2));   //true

        HashCod code1 = new HashCod("Lost");
        HashCod code2 = new HashCod("Lost");

        //System.out.println("code1: " + code1.name.hashCode());
        //System.out.println("code2: " + code2.name.hashCode());
        //System.out.println(code1.equals(code2));
        //System.out.println(code1==code2);

        HashCod code3 = new HashCod("new");
        HashCod code4 = code2;

        ArrayList<HashCod> list = new ArrayList<>();
        list.add(code1);
        list.add(code2);
        list.add(code3);
        list.add(code4);
        System.out.println("ArrayList: " + "\n" + list);

        HashSet<HashCod> set = new HashSet<>();
        set.add(code1);
        set.add(code2);
        set.add(code3);
        set.add(code4);
        System.out.println("HashSet: \n" + set);

        TreeSet<HashCod> tree = new TreeSet<>();
        tree.addAll(list);
        System.out.println("TreeSet: \n" + tree);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        HashCod h = (HashCod) obj;
        return name.equals(h.getName());
    }

    @Override
    public int compareTo(HashCod o) {
        return name.compareTo(o.getName());
    }
}
