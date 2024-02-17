package lesson07;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Как Вас зовут?");
        String name = scanner.nextLine();
        System.out.println( "Привет, " + name + '!');

    }
}
