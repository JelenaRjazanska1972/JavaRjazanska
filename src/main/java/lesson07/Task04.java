package lesson07;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Кака Вас зовут?");
        String name = scanner.nextLine();
        System.out.println( "Ведите ДР?");
        int day= scanner.nextInt();
        System.out.println( "Ведите МР?");
        int month= scanner.nextInt();
        System.out.println( "Ведите ГР?");
        int year = scanner.nextInt();

        double result = (name.length() + day*month) / (double)year;
        result = Math.sin(result);

        if (result < 0.15) {
            System.out.println("У Вас будет веселая жизнь");

        }else if (result <0.25) {
            System.out.println("У Вас будет очень веселая жизнь");
        }
        else if (result <0.5) {
            System.out.println("шикарная жизнь");
        }
        else if (result<0.75) {
            System.out.println("Очень шикарная жизнь");
        }
        else if (result <0.95) {
            System.out.println("Прекрасная жизнь");
        }
            else{

        System.out.println("Чудесная жизнь");
    }
}}
