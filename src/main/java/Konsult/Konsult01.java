package Konsult;
/*сравнивает введенные строки по длине*/

import java.util.Scanner;

public class Konsult01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1= scanner.nextLine();
        String s2=scanner.nextLine();
        if (s1.length()>s2.length()){
            System.out.println("Строка\""+ s1 + "\" длиннеe!");
        }else if (s2.length()>s1.length()) {
            System.out.println("Строка\"" + s2 + "\" длиннеe!");
        }else {
            System.out.println("Строки равны! ");
        }
    }
}
