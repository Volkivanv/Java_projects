package src.seminar3.Task3;

import java.util.ArrayList;

public class ArrayListExample3 {
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
        boolean isEmpty = fruits.isEmpty();


        System.out.println("Список пустой: " + isEmpty);
        fruits.remove("Банан");
        System.out.println("Список после удаления первого 'Банана': " + fruits);

    }
}
