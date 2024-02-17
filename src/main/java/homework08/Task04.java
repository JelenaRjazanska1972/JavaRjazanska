package homework08;
/*Пользователь вводит число, напечатать табличку умножения для этого числа
Например, если введено 4, нужно напечатать:
1 * 4 = 4
2 * 4 = 8
3 * 4 = 12
(и так далее до 10)
*/
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число! ");
        int number=scanner.nextInt();
       int result=0;
        for (int numberOne=1;numberOne<=10;numberOne++) {
            result=number*numberOne;
            System.out.println(number + "*" + numberOne + "=" + result);
        }
    }}



