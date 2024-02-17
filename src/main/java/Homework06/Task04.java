package Homework06;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        double taxE=0.1;
        double taxC=0.05;
        double taxOver=0.02;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите категорию товара 1 - E, 2- C : ");
        int goods  = scanner.nextInt();
        System.out.println("Введите Ваш регион : Регион А - 1; B - 2: ");
        int region = scanner.nextInt();



        if (goods==1) {
            System.out.println("Категория товара: " + goods + "Электроника");
            System.out.println("Введите цену товара: ");
            double price = scanner.nextDouble();
            System.out.println("Цена товара: " + price);
            double priceElTax = price * taxE;
            System.out.println("Налог на данный вид тоавра составляет 10% и составляет" + (priceElTax));
            double priceWithTax = (price + priceElTax);
            if (region == 1) {
                System.out.println("нет налога на данный вид товара для Вашего региона ");
                System.out.println("Общая стоимость с налогом: " + (priceWithTax));
            } else {
                {
                    System.out.println("Ваш регион : Регион А : LV");
                    double PriceElTaxReg = ((priceWithTax) * taxOver);
                    System.out.println("Дополнительный налог на данный вид товара для Вашего региона 2% и составляет" + (PriceElTaxReg));
                    double TotalPrice = (priceWithTax + PriceElTaxReg);
                    System.out.println("Общая стоимость с налогом: " + (TotalPrice = priceWithTax + PriceElTaxReg));
                }
            }
        }else{
            if (goods==2);
            System.out.println("Категория товара: "+ goods + "Одежда");{
            System.out.println("Введите цену товара: ");
            double price = scanner.nextDouble();
            System.out.println("Цена товара: "+ price);
            double priceCTax = price*taxC;
            double priceCWithTax=price+priceCTax;
            if (region==1){

                System.out.println("Налог на данный вид тоавра составляет 0.05 % и составляет" + (priceCTax));
                System.out.println("Общая стоимость с налогом: " + (priceCWithTax));}
            else {
                System.out.println("Ваш регион : Регион А : LV");
                double PriceCTaxReg = ((priceCWithTax) * taxOver);
                System.out.println("Дополнительный налог на данный вид товара для Вашего региона 2% и составляет" + (PriceCTaxReg));
                double TotalPrice = (priceCWithTax + PriceCTaxReg);
                System.out.println("Общая стоимость с налогом: " + (TotalPrice = priceCWithTax + PriceCTaxReg));

            }
//tax+= сумма с присвоением
            }

        }

        scanner.close();
    }
    }

