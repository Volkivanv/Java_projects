package src.seminar6.HashSet;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Дубликаты не добавятся

        System.out.println(names); // Выведет: [Alice, Bob, Charlie]
        names.remove(1); // Удаляем элемент 1

        System.out.println(names); // Выведет: [5, 15]

        boolean containsBanana = names.contains("banana");
        System.out.println("Contains banana: " + containsBanana); // Выведет: Contains banana: true

        boolean empty = names.isEmpty();
        System.out.println("Is the set empty? " + empty); // Выведет: Is the set empty? true

        int vowelCount = names.size();
        System.out.println("Number of vowels: " + vowelCount); // Выведет: Number of vowels: 5



    }
}
