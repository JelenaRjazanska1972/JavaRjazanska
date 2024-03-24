package homework20;

import java.util.ArrayList;

public class Purchase {
    private String itemName;
    private double price;

    public Purchase(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }


    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
/*Создание списка покупок:
a. Создайте класс Purchase с полями itemName (название товара) и price (цена товара).
b. Создайте метод main для инициализации ArrayList с покупками и заполните его несколькими товарами.
2. Добавление новых покупок:
a. Напишите метод для добавления новой покупки в список. Параметры метода: название товара и его цена.
b. Проверьте работу метода, добавив несколько новых покупок в список.
3. Вывод списка покупок:
a. Напишите метод для вывода всех покупок из списка.
b. Проверьте работу метода, вызвав его после добавления нескольких покупок.
4. Поиск покупок:
a. Напишите метод для поиска покупок по названию товара.
b. Проверьте работу метода, вызвав его для поиска нескольких товаров.
5. Удаление покупок:
a. Напишите метод для удаления покупки по её названию.
b. Проверьте работу метода, удалив одну из покупок и выведя список покупок снова.*/

    public static void addPurchase(ArrayList<Purchase> purchaseArrayList, String purchaseName, double purchasePrice) {
        purchaseArrayList.add(new Purchase(purchaseName, purchasePrice));
        System.out.println(purchaseArrayList);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }

    public static void findPurchase(ArrayList<Purchase> purchaseArrayList, String purchaseName) {
        boolean isName = false;
        for (int i = 0; i < purchaseArrayList.size(); i++) {
            if (purchaseArrayList.get(i).getItemName().equals(purchaseName)) {
                System.out.println("Ваша покупка есть в списке " + purchaseName + " " + i);
                isName = true;
            }
        }
        if (!isName) {
            isName = false;
            System.out.println("Вашей покупки нет в списке");
        }
    }

    public static void removePurchase(ArrayList<Purchase> purchaseArrayList, String purchaseName) {
        boolean isRemove = false;
        for (int i = 0; i < purchaseArrayList.size(); i++) {
            if (purchaseArrayList.get(i).getItemName().equals(purchaseName)) {
                purchaseArrayList.remove(i);
                System.out.println("Будет удалено " + purchaseName);
                System.out.println(purchaseArrayList);
                isRemove = true;
            }
        }
        if (!isRemove) {
            isRemove = false;
            System.out.println("Вашей покупки нет в списке");
        }

    }
}























