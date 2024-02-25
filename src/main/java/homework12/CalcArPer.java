package homework12;

import java.util.Scanner;

public class CalcArPer {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: " );
       double lenght = scanner.nextDouble();
        System.out.println("Введите ширину прямоугольника: " );
     double breath = scanner.nextDouble();
        calculateArea(lenght, breath);
        calculatePerimeter(lenght, breath);
    }
    public static void calculateArea(double valueFerst, double valueSecond) {
        double area = valueFerst * valueSecond;
        System.out.println("Площадь прямоугольника: " + area);
    }
    public static void calculatePerimeter(double valueFerst, double valueSecond) {
        double perimeter = valueFerst * 2 + valueSecond * 2;
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
    }




