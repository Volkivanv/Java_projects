package src.seminar2;


public class StringBuilderCreation {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        // Создаем объект StringBuilder с начальным содержимым
       // StringBuilder builder = new StringBuilder("Hello");

        // Добавляем дополнительный текст
        builder.append(", World");
        builder.append("!");

        // Выводим текущее состояние StringBuilder
        System.out.println("Current StringBuilder content: " + builder.toString());

        // Добавляем текст в начало
        builder.insert(0, "Greetings: ");
      //  StringBuilder builder = new StringBuilder("Hello, Java World!");

        // Удаляем часть строки
        builder.delete(6, 11); // Удаляем слово "Java"
        System.out.println("After deletion: " + builder.toString());

        // Заменяем часть строки
        builder.replace(7, 12, "Universe");
        System.out.println("After replacement: " + builder.toString());
        // Выводим измененное состояние
        System.out.println("Modified StringBuilder content: " + builder.toString());


        // Постепенно добавляем текст
        builder.append("Java ");
        builder.append("is ");
        builder.append("awesome.");

        // Преобразуем StringBuilder обратно в строку
        String finalString = builder.toString();

        // Выводим итоговую строку
        System.out.println("Final string: " + finalString);

        System.out.println(System.identityHashCode(builder));


    }
}


