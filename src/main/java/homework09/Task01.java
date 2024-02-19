package homework09;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        System.out.println("Какую арифметическую операцию Вы хотите выполнить? ");
        boolean exit=true;
        while (exit) {

            System.out.println("Введите '1' для сложения");
            System.out.println("Введите '2' для вычитания");
            System.out.println("Введите '3' для умножения");
            System.out.println("Введите '4' для деления");

            Scanner scanner = new Scanner(System.in);
            int op = scanner.nextInt();



            System.out.println("Введите числа");
            double number = scanner.nextDouble();
            double numberOne = scanner.nextDouble();
            double res = 0;

            if (op == 1) {
                System.out.println("Вы выбрали сложение");
                res = number + numberOne;
                System.out.println("Сумма введенных Вами чисел = " + res);


            } else if (op == 2) {
                System.out.println("Вы выбрали вычитание");
                res = number - numberOne;
                System.out.println("Разница введенных Вами чисел = " + res);

            } else if (op == 3) {
                System.out.println("Вы выбрали умножение");
                res = number * numberOne;
                System.out.println("Произведение введенных Вами чисел = " + res);

            } else if (op==4){
                System.out.println("Вы выбрали деление");
                if (numberOne == 0) {
                    System.out.println("Делить на ноль нельзя!");
                } else {
                    res = number / numberOne;
                    System.out.println("Частное введенных Вами чисел = " + res);

                }}System.out.println("Хотите продолжить? y/n");
                        String answer=scanner.next();
                        if (answer.equals("n")) {
                            exit = false;
                            System.out.println("Конец");

                } } }


    }








