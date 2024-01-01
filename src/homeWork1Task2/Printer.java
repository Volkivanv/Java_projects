package src.homeWork1Task2;

import java.util.ArrayList;
import java.util.List;

class Answer {
    public void printPrimeNums() {
        // Напишите свое решение ниже
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < 1000; i++) {
            boolean isPrime = true;
            for (int j : primes) {
                if (i % j == 0) isPrime = false;
            }
            if (isPrime) {
                primes.add(i);
                System.out.println(i);
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}