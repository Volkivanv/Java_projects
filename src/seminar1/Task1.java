package src.seminar1;//Задание №1+
//        📌 В консоли запросить имя пользователя. В зависимости от
//        текущего времени, вывести приветствие вида
//📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59


import java.time.LocalTime;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        iScanner.close();

        LocalTime now = LocalTime.now();
        LocalTime beginMorning = LocalTime.parse("05:00");
        LocalTime beginDay = LocalTime.parse("12:00");
        LocalTime beginEvening = LocalTime.parse("18:00");
        LocalTime beginNight = LocalTime.parse("23:00");
        System.out.println(now.toString());

        if (now.compareTo(beginMorning) >= 0 && now.compareTo(beginDay) < 0) {
            System.out.printf("Доброе утро %s \n", name);
        } else if (now.compareTo(beginDay) >= 0 && now.compareTo(beginEvening) < 0) {
            System.out.printf("Добрый день %s \n", name);
        } else if (now.compareTo(beginEvening) >= 0 && now.compareTo(beginNight) < 0) {
            System.out.printf("Добрый вечер %s \n", name);
        } else {
            System.out.printf("Доброй ночи %s \n", name);
        }

    }
}