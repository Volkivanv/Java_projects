package src.homeWork3;

import java.util.Arrays;
import java.util.ArrayList;


class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        arrList.sort((a, b) -> a - b);
        System.out.println(arrList);
//        Minimum is 1
//        Maximum is 9
        int min = arrList.get(0);
        int max = arrList.get(arrList.size() - 1);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);

 //       Average is =  {число}
        int sum = 0;
        for (int i = 0; i < arrList.size(); i++) {
            sum += arrList.get(i);
        }
        double average = (double) sum / arrList.size();
        System.out.println("Average is = " + average);



    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}
