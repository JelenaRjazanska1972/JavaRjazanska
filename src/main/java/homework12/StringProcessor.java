package homework12;

import java.util.Scanner;

public class StringProcessor {
    static String name = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");

        while (true) {
            if (scanner.hasNextInt()) {
                System.out.println("Ошибка, введите строку");
                scanner.nextLine();
            } else {
                name = scanner.nextLine().replaceAll(" ", "");
                break;
            }
        }
        reverseString(name);
        System.out.println(reverseString(name));
        isPalindrome(name);
    }
    public static String reverseString(String text) {
        char[] textOne = text.toCharArray();
        String textNew = "";
        for (int i = textOne.length - 1; i >= 0; i--) {
            textNew = textNew + textOne[i];
        }
        return textNew;
    }
    public static Boolean isPalindrome(String text) {

        String textNew = new String(reverseString(text));
        if (text.equals(textNew)) {
            System.out.println("Это палиндром!");
            return true;
        } else {
            System.out.println("Строки разные. Это не палиндром! ");
            return false;
        }
    }
}


