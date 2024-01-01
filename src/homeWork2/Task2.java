//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
//Напишите свой код в методе sort класса BubbleSort.
// Метод sort принимает на вход один параметр:
//int[] arr - числовой массив
//После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt'
// в формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования
// использовать логгер logger класса BubbleSort.

package src.homeWork2;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;



class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {

        try {
            log = new File("log.txt");
            if (!log.exists()) {
                log.createNewFile();
            }

            fileWriter = new FileWriter(log, false);

            for (int i = 0; i < mas.length - 1; i++) {
                boolean flag = false;
                for (int j = 0; j < mas.length - 1 - i; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                        flag = true;
                    }
                }
                if(flag) {
                    fileWriter.append(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
                    fileWriter.append(" ").append(Arrays.toString(mas)).append("\n");
                }
            }
            fileWriter.append(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
            fileWriter.append(" ").append(Arrays.toString(mas)).append("\n");
            fileWriter.flush();
           // log.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
