package homework09;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        System.out.println(number);
        int counter = 0;
       int numberNext=0;
        do {
            System.out.println("Угадайте загаданное число!");
            Scanner scanner = new Scanner(System.in);
            numberNext = scanner.nextInt();
            if (numberNext < number) {
                System.out.println("Ваше число меньше загаданного! Пробуйте еще раз!");
                counter = counter++;
            } else {
                System.out.println("Ваше число больше загаданного! Пробуйте еще раз!");
                counter = counter++;
            }} while (counter != 5 || numberNext==number);
        System.out.println("Бинго!");
        System.out.println("Число попыток!" + counter);
    }
}

