//Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива.
//        Необходимо удалить из списка четные числа и вернуть результирующий.
//
//        Напишите свой код в методе removeEvenNumbers класса Answer.
//        Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>


package src.homeWork3;

import java.util.Arrays;
import java.util.ArrayList;



class Answer2 {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        int n = arrList.size();
        for (int i = n - 1; i >= 0; i--) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        }
        return arrList;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 4, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }
        System.out.println(Arrays.toString(arr));

        Answer2 ans = new Answer2();
        System.out.println(ans.removeEvenNumbers(arr));
    }
}