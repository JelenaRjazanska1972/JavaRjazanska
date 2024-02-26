package homework12;

import java.util.Scanner;

public class StringProcessor {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        String name = scanner.nextLine();
        boolean check=false;
isPalindrome(name,check);

    }
        public static String reverseString (String text){
            char[] textOne = text.toCharArray();
            String textNew = "";
            for (int i = textOne.length-1; i >= 0; i--) {
                textNew = textNew + textOne[i];
                System.out.println(textNew);

        }
            return textNew;

}
public static Boolean isPalindrome (String text,boolean palindrome){
    char[] textOne = text.toCharArray();
    String textNew = "";
    boolean result;
    for (int i = textOne.length-1; i >= 0; i--) {
        textNew = textNew + textOne[i];
        System.out.println(textNew);
    }
    if (text.equals(textNew)){
        result=true;
    }else {
        result = false;
    }
    {System.out.println(result);};
    return result;

}

}
