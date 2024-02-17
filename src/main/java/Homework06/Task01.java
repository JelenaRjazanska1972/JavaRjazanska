package Homework06;

import java.util.Scanner;

public class Task01 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println ("Введите первое слагаемое: ");
        double numberOne = scanner.nextDouble ();
        System.out.println("Вы ввели число " + numberOne);
        System.out.println("Введите второе слагаемое: ");
        double numberTwo = scanner.nextDouble();
        System.out.println("Вы ввели число " + numberTwo);
        double sum = numberOne + numberTwo;
        { System.out.println("Сумма чисел равна " + sum);

    }
        scanner.close();
}}
//int numberCheck = number/ 2 *2;
//if(number == numberCheck)
//    System.out.println("Ваше число является четным!");
//else
//    System.out.println("Ваше число является нечетным!");