package homework16;

public class UtilVarArgsNew {
    public static void main(String[] args) {


        double fixAssets = 300.0;
        double reversAssets = 100.5;
        System.out.println("Сумма оборотных и основных средств предприятия составляет: " + assets(fixAssets, reversAssets));
        int[] year = {2019, 2020, 2021, 2022, 2023};
        double[] fixed = new double[5];
        fixed[0] = 300.2;
        fixed[1] = 250.5;
        fixed[2] = 355.5;
        fixed[3] = 200.5;
        fixed[4] = 300.0;
        //Проверяю данные на валидность
        check(fixed);
        //Если ОК, статистика
        System.out.println("Статистика основных средств предприятия за 5 лет: ");
        statistics(fixed, year);
        double fixedMin;
        double fixedMax;
        double fixedSum;
        double fixedMid;
       //И вызываем методы по необходимости
        statisticsMin(fixed);
        statisticsMax(fixed);
        statisticsMid(fixed);
        System.out.println("Самая низкая стоимость основных средств : " + statisticsMin(fixed) + " тысяч Евро");
        System.out.println("Самая высокая стоимость основных средств : " + statisticsMax(fixed) + " тысяч Евро");
        System.out.println("Средняя стоимость основных средств за 5 лет : " + statisticsMid(fixed) + " тысяч Евро");

    }
    public static double assets(double fixedAssets, double reversAssets) {
        double resources = fixedAssets + reversAssets;
        return resources;
    }
    public static void check(double[] elements) {
        if (elements.length == 0) {
            System.out.println("Неверные значения!");
        } else {
            boolean exit = true;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] < 0) {
                    exit = false;
                    break;
                }
            }
            if (exit == true) {
                System.out.println("Исходные данные корректны! ");
            } else {
                System.out.println("Один из элементов имеет отрицательное значение!");
            }
        }
    }
    public static void statistics(double elements[], int rang[]) {
        for (int i = 0; i < elements.length; i++) {
            int rangNext = rang[i];
            double elementsNext = elements[i];
            {
                System.out.println(rangNext + " " + elementsNext);
            }
        }
    }
    public static double statisticsMin(double elements[]) {
        double elementMin = elements[0];

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < elementMin) {
                elementMin = elements[i];
            }
        }
        return elementMin;
    }
    public static double statisticsMax(double elements[]) {
        double elementMax = elements[0];

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > elementMax) {
                elementMax = elements[i];
            }
        }
        return elementMax;
    }
    public static double statisticsMid(double elements[]) {
        double elementMid = elements[0];
        double elementSum = 0;
        for (int i = 0; i < elements.length; i++) {

            elementSum = elements[i] + elementSum;
            elementMid = elementSum / elements.length;
        }
        return elementMid;
    }
}








