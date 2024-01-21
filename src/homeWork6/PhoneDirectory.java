//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что в во входной структуре
// будут повторяющиеся имена с разными телефонами, их необходимо считать,
// как одного человека с разными телефонами. Вывод должен быть отсортирован
// по убыванию числа телефонов.


package src.homeWork6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class PhoneBook {
    private static final HashMap<String, Person> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).addPhone(phoneNum);
        } else {
            Person p = new Person(name);
            p.clear();
            p.addPhone(phoneNum);
            phoneBook.put(name, p);
        }

    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> list = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            Person p = phoneBook.get(name);
            list = Person.getPhones();
        }
        return list;
    }

    public static void printPhoneBook() {

        ArrayList<Person> persons = new ArrayList<>(phoneBook.values());
        Collections.sort(persons);
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("--------------------------------");

    }
}

// Не удаляйте этот класс - он нужен для
public class PhoneDirectory {
    public static void main(String[] args) {


        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Ivanov", 1223445);
        myPhoneBook.add("Ivanov", 4536363);
        myPhoneBook.add("Ivanov", 4536963);
        myPhoneBook.add("Petrov", 5454556);
        myPhoneBook.add("Petrov", 2345233);
        myPhoneBook.add("Sidorov", 8329923);
        myPhoneBook.add("Sidorov", 8329323);
        myPhoneBook.add("Sidorov", 1233434);


        //  System.out.println(myPhoneBook.find("Ivanov"));
        //  System.out.println(myPhoneBook.find("Sidorov"));
        PhoneBook.printPhoneBook();
        System.out.println(myPhoneBook.find("Me"));
    }
}
