package lesson07;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа, которые нужно разделить");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String res;
        if (b == 0) {
            res = "Делить на 0 нельзя!";
        } else {
            res = (a + "/" + b) + "=" + (a / b);
        }

        System.out.println(res);
    }


}

