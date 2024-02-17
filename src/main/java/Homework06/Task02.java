package Homework06;

import java.util.Scanner;

public class Task02 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите запрашиваемое число в виде десятичной дроби: ");
        double number = scanner.nextDouble();
        System.out.println("Введите это же число в виде целого числа  ");
        int numberTwo = scanner.nextInt();
  if ((number/2)-(numberTwo/2)==0) {
      System.out.println("Число четное");//even
  }
       else {
            System.out.println("Число нечетное");//odd
        }
        /*Scanner reader = new Scanner(System.in);

                 System.out.print("Введите число для проверки: ");

        int number = reader.nextInt();

                  if(number % 2 == 0)
int numberCheck = number/ 2 *2;
if(number == numberCheck)
    System.out.println("Ваше число является четным!");
else
    System.out.println("Ваше число является нечетным!");
                                  */

        scanner.close();
        }
    }


