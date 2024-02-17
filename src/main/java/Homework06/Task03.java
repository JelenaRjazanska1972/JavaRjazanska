package Homework06;

import java.util.Scanner;

public class Task03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
System.out.println("Введите свою оценку по математике");
double GradMat= scanner.nextDouble();
        System.out.println("Введите свою оценку по физике");
        double GradPhys= scanner.nextDouble();
        System.out.println("Введите свою оценку по химии");
        double GradChim= scanner.nextDouble();
        System.out.println("Введите свою оценку по английскому языку");
        double GradEng= scanner.nextDouble();
        System.out.println("Введите свою оценку по спорту");
        double GradSport= scanner.nextDouble();
        double TotalGrad = ((GradMat+GradPhys+GradChim+GradEng+GradSport)/5);
        System.out.println("Ваша оценка по математике: "+GradMat);
        System.out.println("Ваша оценка по физике: "+GradPhys);
        System.out.println("Ваша оценка по химии: "+GradChim);
        System.out.println("Ваша оценка по английскому языку: "+GradEng);
        System.out.println("Ваша оценка по спорту: "+GradSport);
        System.out.println("Ваша средняя оценка : "+ TotalGrad);
        scanner.close();
    }

}

