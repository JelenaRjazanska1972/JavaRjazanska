package homework07;


import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Вы ввели: " + age);
if (age<=12) {
    System.out.println("Вы ребенок!");
}
else if (age>12 && age<=18) {

    System.out.println ("Вы подросток!");
}
else if (age > 18 && age<=25) {
    System.out.println("Вы находитесь в юношеском возрасте!");
}
else if (age>25 && age<=60) {
    System.out.println("Вы зрелый человек!");
} else if (age>60 && age<=75) {
    System.out.println("Вы пожилой человек!");
}
else if (age>75 && age<=90){
    System.out.println("Вы сеньор!");
}
else {
    System.out.println("Вы долгожитель!");
    }
        scanner.close();
    }
}
