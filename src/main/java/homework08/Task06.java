package homework08;
/*Пользователь вводит число. Посчитать суммму всех его цифр.
Например, для числа одна тысяча двести тридцать четыре (1234) результат будет 10
*/
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число! ");
        int number = scanner.nextInt();
       int sum = 0;
        while (number>0) {
            sum+=number%10;
            number/=10;
            System.out.println(number);
        }
            System.out.println("Сумма цифр числа "+ number + "равна" + sum);

        }
    }



