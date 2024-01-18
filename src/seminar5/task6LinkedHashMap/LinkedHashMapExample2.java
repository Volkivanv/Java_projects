package src.seminar5.task6LinkedHashMap;

import java.util.LinkedHashMap;

//Словарь, который имеет порядок. HashMap не имеет порядка
public class LinkedHashMapExample2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>();

        // Проверяем, пуст ли LinkedHashMap
        boolean isEmpty = ageMap.isEmpty();
        System.out.println("LinkedHashMap пустой? " + isEmpty);
    }
}
