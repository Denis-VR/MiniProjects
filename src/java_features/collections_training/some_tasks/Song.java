package java_features.collections_training.some_tasks;

import java.util.*;

public class Song implements Comparable<Song> {
    private String name;
    private int rating;
    private String surname;

    public Song(String name, int rating, String surname) {
        this.name = name;
        this.rating = rating;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Song o) {
        return name.compareTo(o.getName());
    }

    static class RatingCompare implements Comparator<Song> {

        @Override
        public int compare(Song o1, Song o2) {
            return o1.getRating() - o2.getRating();
        }
    }

    static class SurnameCompare implements Comparator<Song> {

        @Override
        public int compare(Song o1, Song o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    }

    @Override
    public String toString() {
        return name + "-\"" + surname + "\" (" + rating + " place)";
    }

    public static void main(String[] args) {
        Song song1 = new Song("B", 8, "в");
        Song song2 = new Song("C", 9, "а");
        Song song3 = new Song("A", 1, "б");
        Song song4 = new Song("D", 4, "г");
        Song song5 = new Song("F", 3, "д");

        ArrayList<Song> list = new ArrayList<>();
        list.add(song1);
        list.add(song2);
        list.add(song3);
        list.add(song4);
        list.add(song5);

        System.out.println("Сортировка по имени с помощью compareTo():");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("\nСортировка по рэйтингу:");
        Collections.sort(list, new RatingCompare());
        System.out.println(list);

        System.out.println("\nСортировка по фамилиям:");
        Collections.sort(list, new SurnameCompare());
        System.out.println(list);


    }
}