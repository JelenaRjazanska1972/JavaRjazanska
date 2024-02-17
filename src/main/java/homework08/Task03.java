package homework08;
/*Пользователь вводит число, посчитать сумму всех натуральных чисел, которые идут до него включительно.*/
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        double result = 0;
        double sum = 0;

            if (number%1!=0) {
                System.out.println("Введенное Вами число не натуральное");
            } else {
                do {
                    result = number--;
                    System.out.println(result);
                    sum += result--;
                } while (number >= 0);

                System.out.println("Сумма всех натуральных чисел, следуя от введенного Вами числа до 0 равнв: " + sum);

            }
        }
    }