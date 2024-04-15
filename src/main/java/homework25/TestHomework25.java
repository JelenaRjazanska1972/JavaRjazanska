package homework25;
//Создайте несколько объектов MenuItem, например, кофе (тип DRINK) и пиццу (тип DISH).
//Выведите информацию о каждом объекте, используя System.out.println.
//Выведите на экран описание текущего статуса заказа.

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;

public class TestHomework25 {
    public static EnumSet<MenuItemType> menuItemTypes = EnumSet.of(MenuItemType.DISH, MenuItemType.DRINK);
    public static EnumMap<MenuItemType, String> menuItemTypeMenuItemEnumMap = new EnumMap<>(MenuItemType.class);

    public static void main(String[] args) {

        menuItemTypes.add(MenuItemType.DISH);
        menuItemTypes.add(MenuItemType.DRINK);
        System.out.println(menuItemTypes.toString());

        menuItemTypeMenuItemEnumMap.put(MenuItemType.DISH, "Pizza");
        menuItemTypeMenuItemEnumMap.put(MenuItemType.DRINK, "Сoffee");

        System.out.println(menuItemTypeMenuItemEnumMap.toString());
        ArrayList<EnumMap<MenuItemType, String>> order = new ArrayList<>();
        int orderNumber = 0;
        order.add(menuItemTypeMenuItemEnumMap);
        orderNumber++;
        System.out.println(order + "Order number is " + orderNumber);

        OrderStatus.getDescription(OrderStatus.PENDING);
        OrderStatus.canCancel(OrderStatus.PENDING);
    }
}


