package homework20;

import java.util.ArrayList;
public class PurchaseTest {
    public static void main(String[] args) {
        ArrayList<Purchase> purchases = new ArrayList<>();

        Purchase PurchaseOne = new Purchase("Bread", 2.5);
        Purchase PurchaseTwo = new Purchase("Cheese", 2.69);
        Purchase PurchaseThree = new Purchase("Сhocolate", 0.88);

        purchases.add(PurchaseOne);
        purchases.add(PurchaseTwo);
        purchases.add(PurchaseThree);

        Purchase.addPurchase(purchases, "Bier", 2);

        Purchase.findPurchase(purchases, "Cheese");

        Purchase.removePurchase(purchases, "Bier");

    }
}




