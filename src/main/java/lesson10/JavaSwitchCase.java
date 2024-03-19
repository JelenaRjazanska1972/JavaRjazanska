package lesson10;

public class JavaSwitchCase {
    public static void main(String[] args) {
        String expression="value1";
        switch (expression){
            case "value1":
                //код для выполнения если expression == "value1"
                break;
            case "value2":
                //код для выполнения если expression == "value2"
                break;
            case "value3":
                //код для выполнения если expression == "value2"
                break;
            default:
                //код для выполнения если expression не соответствует ни одному case"
        }
        int day=3;
        String dayString;
        switch (day){
            case 1:
                dayString="Понедельник";
                break;
            case  2:
                dayString="Вторник";
            case  3:
                dayString="Среда";
                break;
            default:
                dayString="Остальные дни";
                break;

        }
        System.out.println(dayString);

        dayString=switch (day){
            case 1,2,3,4,5 -> "Рабочий день";
            case 6,7 -> "Выходной";
            default -> "Ошибка!!!";
        };
        System.out.println(dayString);
    }
}
