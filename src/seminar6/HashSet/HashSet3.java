package src.seminar6.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        //Механизм перебора в коллекции
        //Итератор позволят удалять элементы объекта
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        //hasNext()
        //next

    }
}
