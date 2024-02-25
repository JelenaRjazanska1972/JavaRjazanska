package homework09;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char gameOver;
        do {
            int number = (int) (Math.random() * 101);
            System.out.println(number);
            int counter = 0;
            int maxCounter = 3;
            System.out.println("Угадайте загаданное число от 1 - 100! У Вас " + maxCounter + "попыток");
            while (true) {
                System.out.println("Введите число ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ошибка введите число!");
                    scanner.next();
                }
                int numberNext = scanner.nextInt();
                if (numberNext < 1 || numberNext > 100) {
                    System.out.println("Число должно быть в диапазоне 1 - 100!");
                    continue;
                }
                counter++;
                if ((numberNext < number)) {
                    System.out.println("Ваше число меньше загаданного! Пробуйте еще раз!");
                } else if (numberNext > number) {
                    System.out.println("Ваше число больше загаданного! Пробуйте еще раз!");
                } else {
                    System.out.println("Бинго!" + number);
                    break;
                }
                if (counter >= maxCounter) {
                    System.out.println("Вы использовали все попытки!");
                    break;
                }
            }
                        System.out.println("Для продолжения выберете y и для выхода n");
                        gameOver=scanner.next().toLowerCase().charAt(0);
            }
            while (gameOver=='y');
            System.out.println("Спасибо за игру!");
            scanner.close();

    }}

