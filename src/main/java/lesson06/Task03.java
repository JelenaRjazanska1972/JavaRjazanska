package lesson06;

import java.util.Scanner;

public class Task03 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        //число введенное с клавиатуры (scanner) будет сохранено int переменная nubmer

        int number= scanner.nextInt();
        System.out.println("Вы ввели: " + number);
        System.out.println("Введите имя: ");
        // сканер необходимот закрыть
String name = scanner.next();
        System.out.println("Ваше имя: " + name);
        scanner.close();
    }
}
