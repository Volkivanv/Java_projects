package src.homeWork1Task3;

import java.text.DecimalFormat;

class Calculator {
    public String calculate(char op, int a, int b) {
        // Введите свое решение ниже
        switch (op) {
            case '+': return new DecimalFormat("#0.0").format((float) a + (float) b);
            case '-': return new DecimalFormat("#0.0").format((float) a - (float) b);
            case '*': return new DecimalFormat("#0.0").format((float) a * (float) b);
            case '/': return new DecimalFormat("#0.0").format((float) a / (float) b);
            default: return "Некорректный оператор: '" + op + "'";
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class CalculatorPrint{
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '*';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        String result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}