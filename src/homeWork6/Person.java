package src.homeWork6;

import java.util.ArrayList;

public class Person implements Comparable<Person> {
    private final String name;
    private static ArrayList<Integer> phones = new ArrayList<Integer>(0);

    Person(String name){
        this.name = name;
    }

    public static ArrayList<Integer> getPhones() {
        return phones;
    }

    public void addPhone(int phone) {
        if (!phones.contains(phone)) {
            phones.add(phone);
        }
    }

    public void removePhone(int phone) {
        phones.remove(phone);
    }

    public void clear() {
        phones.clear();
    }

    @Override
    public String toString() {
        return name + getPhones().toString();
    }

    @Override
    public int compareTo(@org.jetbrains.annotations.NotNull Person p) {
        return phones.size() - p.getPhones().size();
    }
}
