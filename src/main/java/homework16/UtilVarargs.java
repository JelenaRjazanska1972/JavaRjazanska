package homework16;


import java.util.Scanner;


public class UtilVarargs {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double fixAssets = 200.5;
        double reversAssets = 100.5;
        assets(fixAssets, reversAssets);

        int[] year = {2019, 2020, 2021, 2022, 2023};
        double[] fixed = new double[5];
        fixed[0] = 200.5;
        fixed[1] = 250.5;
        fixed[2] = 355.5;
        fixed[3] = 300.3;
        fixed[4] = 301.0;
        statistics(fixed, year);
        double fixedMin;
        double fixedMax;
        double fixedSum;
        double fixedMid;
        statisticsAnalyse(fixed);
    }
    public static double assets(double fixedAssуts, double reversAssets) {
        double resources = fixedAssуts + reversAssets;
        System.out.println("Сумма оборотных и основных средств предприятия составляет: " + resources + " тысяч Евро");
        return resources;
    }
    public static void statistics(double[] elements, int[] rang) {
        for (int i = 0; i < elements.length; i++) {
            int rangNext = rang[i];
            double elementsNext = elements[i];
            System.out.println(rangNext + " " + elementsNext);
        }
    }
    public static double statisticsAnalyse(double elements[]) {
        double elementMin = elements[0];
        double elementMax = elements[0];
        double elementSum = 0;
        double elementMid = 0;
        boolean exit = true;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] <= 0) {
                exit = false;
                System.out.println("Один из элементов отсутствует или имеет отрицательное значение!");
                break;
            }
            if (elements[i] < elementMin) {
                elementMin = elements[i];
            }
            if (elements[i] > elementMax) {
                elementMax = elements[i];
            }
            {
                elementSum = elements[i] + elementSum;
                elementMid = elementSum / elements.length;
            }
        }
        System.out.println(elementMin);
        System.out.println(elementMax);
        System.out.println(elementSum);
        System.out.println(elementMid);
        return elementMid;
    }
}










































