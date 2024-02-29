package homework12;

import java.util.Scanner;

public class CalcArPer {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: " );
       double lenght = scanner.nextDouble();
        System.out.println("Введите ширину прямоугольника: " );
     double breath = scanner.nextDouble();


        System.out.println("Площадь прямоугольника: " + calculateArea(lenght,breath));
        System.out.println("Периметр прямоугольника: " + calculatePerimeter(lenght, breath));
    }
    public static double calculateArea(double valueFerst, double valueSecond) {
        double area = valueFerst * valueSecond;
        return area;
    }
    public static double calculatePerimeter(double valueFerst, double valueSecond) {
        double perimeter = valueFerst * 2 + valueSecond * 2;
        return perimeter;
    }
    }




