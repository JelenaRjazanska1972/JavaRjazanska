package homework10;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
    System.out.println("Какая марка автомобилей Вас интересует?");
    String auto = scanner.nextLine();
    System.out.println("Популярность автомобилей какого года Вас интересует?");
    while (!scanner.hasNextInt()){
        System.out.println("Ошибка введите число!");
        scanner.next();
    }
    int year = scanner.nextInt();
    switch (year) {
        case 2020:
            auto = "Toyota";
            System.out.println("Японская марка. В 2020 году самый популярный автомобиль в 44 странах мира. Популярные модели: седан Toyota Corolla, внедорожник Rav4 и хит пикап Hilux.");
            break;
        case 2021:
            auto = "Ford";
            System.out.println("Американская марка автомобилей. Ford в 2021 году находился на шестом месте по продажам. Самым продаваемым спорткаром стал Ford Mustang");
            break;
        case 2022:
          auto = "Volkswagen";
            System.out.println("Вторыми по продажам в 2022 году были автомобили от Volkswagen Group Volkswagen модельный ряд включает в себя популярные автомобили прошлых лет и новинки.");
            break;
        case 2023:
            auto = "Tesla";
            System.out.println("«Тесла» — американская компания, производитель электромобилей. Tesla Model Y была самым популярным автомобилем в Европе в  2023.");
            break;
        default: System.out.println("Ende");
        scanner.close();
    }}}



