package homework25;

public enum OrderStatus {

    PENDING("is pending approval"),
    PROCESSING("is in processing"),
    SHIPPED("is shipped"),
    DELIVERED("is delivered"),
    CANCELLED("is cancelled");
    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void getDescription(OrderStatus orderStatus) {
        switch (orderStatus) {
            case PENDING:
                System.out.println("Your order " + orderStatus.getDescription());
                break;
            case SHIPPED:
                System.out.println("Your order " + orderStatus.getDescription());
                break;
            case CANCELLED:
                System.out.println("Your order " + orderStatus.getDescription());
                break;
            case DELIVERED:
                System.out.println("Your order " + orderStatus.getDescription());
                break;
            case PROCESSING:
                System.out.println("Your order " + orderStatus.getDescription());
                break;
        }
//Расширьте перечисление OrderStatus, добавив метод canCancel(), который будет возвращать true
// для статусов, когда заказ еще может быть отменен
// (PENDING, PROCESSING), и false для остальных. Выведите результат этого метода в main.

    }
public static boolean canCancel (OrderStatus orderStatus){
        boolean isCancel=true;
        if (orderStatus.equals(PENDING)){
            System.out.println("Your order " + orderStatus.getDescription() + " and may still be cancelled.");
}
    return isCancel;}}



