package lesson09;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("jjjjj");

        System.out.println("jjjljfr");
        int number= scanner.nextInt();
        if (number>0) {
            int min = number;
            int max= number;
                while (number>0 ) {
                    if (number>max){
                max=number;
                }else if (number<min) {
                        min = number;
                    }
                System.out.println("введите числа");
           number= scanner.nextInt();
        }
            System.out.println("min =" + min);
            System.out.println("max = " + max);
    }
        System.out.println("прогр завершена");
}}
