package src.seminar3.Task4;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Банан");

        // Находим индекс первого вхождения "Банан" в списке
        int indexOfBanana = fruits.indexOf("Банан");

        System.out.println("Индекс первого вхождения 'Банан' в списке: " + indexOfBanana);
    }
}