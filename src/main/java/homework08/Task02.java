package homework08;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        int multiplyable=1;
        Scanner scanner=new Scanner(System.in);
        int factor =scanner.nextInt();
        System.out.println("Введите число: ");
        do {
           int result=factor*multiplyable;
           System.out.println(multiplyable + "*" + factor + "=" + result);
            multiplyable++;
        }while (multiplyable<=10);
        }
    }

