package homework10;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
    System.out.println("Какая марка из Топ 5 проданных в Европе автомобилей Вас интересует?");
    String auto = scanner.nextLine().toLowerCase();
    System.out.println("Популярность моделей какого года Вас интересует?");
        String countryOfOrigin;
        String autoInfo;
    while (!scanner.hasNextInt()){
        System.out.println("Ошибка введите четырехзначное число!");
        scanner.next();
    }
        int year = scanner.nextInt();
    switch (auto) {
        case "toyota":
            countryOfOrigin="Японская марка.";
            if (year==2020){
                autoInfo="В 2020 году популярный бренд в 44 странах мира но не вошла в Топ - 5 по продажам в Европе.";}
            else if (year==2021) {
                autoInfo="В 2021 году вошла в Топ - 5 по продажам в Европе, самые популярные марки Toyota Yaris, Toyota Corolla и ToyotaC-HR.";}
            else if (year==2022) {
                autoInfo="В 2022 году вошла в Топ - 5 по продажам в Европе, самые популярная марка Toyota Yaris.";}
            else if (year==2023){
                autoInfo="В 2022 году не вошла в Топ - 5 по продажам в Европе.";}
            else{
                autoInfo="Информация на данный отрезок времени отсутствует";}
            break;
        case "wolkswagen":
            countryOfOrigin="Бренд Немецкого автоконцерна.";
            if (year==2020){
                autoInfo="В 2020 году вошел в Топ - 5 по продажам в Европе.Популярные марки: Golf, Polo и Tiguan.";}
            else if (year==2021) {
                autoInfo="В 2021 году вошел в Топ - 5 по продажам в Европе. Самые популярные марки Golf, T-Roc и Tiguan .";}
            else if (year==2022) {
                autoInfo="В 2022 году вошел в Топ - 5 по продажам в Европе. Самые популярная марки Golf и T-Roc.";}
            else if (year==2023){
                autoInfo="В 2023 году вошел в Топ - 5  по продажам в Европе. Самая популярная марка T-Roc.";}
            else{
                autoInfo="Информация на данный отрезок времени отсутствует";}
            break;
        case "pegeut":
            countryOfOrigin="Французская автомобилестроительная компания.";
            if (year==2020){
                autoInfo="В 2020 году вошел в Топ - 5 по продажам в Европе.Популярные марки: Peugeot 208 и Peugeot 2008.";}
            else if (year==2021) {
                autoInfo="В 2021 году вошел в Топ - 5 по продажам в Европе. Самые популярные марки Peugeot 208 и Peugeot 3008.";}
            else if (year==2022) {
                autoInfo="В 2022 году вошел в Топ - 5 по продажам в Европе. Популярные марки: Peugeot 208 и Peugeot 2008.";}
            else if (year==2023){
                autoInfo="В 2023 году вошел в Топ - 5  по продажам в Европе. Самая популярная марка Peugeot 208.";}
            else{
                autoInfo="Информация на данный отрезок времени отсутствует";}
            break;
        case "renault":
            countryOfOrigin="Французская автомобилестроительная компания.";
            if (year==2020){
                autoInfo="В 2020 году вошел в Топ - 5 по продажам в Европе.Популярные марки: Clio и Captur.";}
            else if (year==2021) {
                autoInfo="В 2021 году вошел в Топ - 5 по продажам в Европе. Самая популярная марка Renault Captur.";}
            else if (year==2022) {
                autoInfo="В 2022 году вошел в Топ - 5 по продажам в Европе. Самая популярная марка Renault Clio.";}
            else if (year==2023){
                autoInfo="В 2023 году вошел в Топ - 5  по продажам в Европе. Самая популярная марка Renault Clio.";}
            else{
                autoInfo="Информация на данный отрезок времени отсутствует";}
            break;
        case "tesla":
            countryOfOrigin="Американская компания производитель электромобилей и решений для хранения электроэнергии .";
            if (year==2020){
                autoInfo="В 2020 году не вошла в Топ - 5 по продажам в Европе. По состоянию на март 2020 года Tesla предлагала четыре модели автомобилей: Model S, Model 3, Model X и Model Y. ";}
            else if (year==2021) {
                autoInfo="В 2021 не вошла в Топ - 5 по продажам в Европе.Tesla предлагала четыре модели автомобилей: Model S, Model 3, Model X и Model Y. ";}
            else if (year==2022) {
                autoInfo="В 2022 году не вошла в Топ - 5 по продажам в Европе.Tesla предлагала четыре модели автомобилей: Model S, Model 3, Model X и Model Y.";}
            else if (year==2023){
                autoInfo="В 2023 году вошла в Топ - 5  по продажам в Европе. Самая популярная марка Model Y.";}
            else{
                autoInfo="Информация на данный отрезок времени отсутствует";}
            break;
        default:
            countryOfOrigin="Не найдена";
            autoInfo="Нет информации";
            break;
    }
            System.out.println("Производитель: " + countryOfOrigin);
            System.out.println(autoInfo);
            scanner.close();
    }
    }



