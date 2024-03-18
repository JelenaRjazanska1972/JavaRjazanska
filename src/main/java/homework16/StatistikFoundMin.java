package homework16;

public class StatistikFoundMin {
    public static void main(String[] args) {
        int[] year = {2019, 2020, 2021, 2022, 2023};
        double[] fixed = new double[5];
        fixed[0] = 200.5;
        fixed[1] = 250.5;
        fixed[2] = 355.5;
        fixed[3] = 300.3;
        fixed[4] = 300.0;

        double fixedMax = 0;
        double yearMax = 0;
        boolean found = false;
        for (int i = 0; i < fixed.length; i++) {
            if (fixed[i] > fixedMax)
                fixedMax = fixed[i];
            if (fixed[i] == fixedMax) {
                int ind = i;
                for (int j = 0; j < year.length; j++) {
                    if (j == ind) {
                        yearMax = year[j];
                        found = true;
                    }
                }
            } else {
                found = false;
                System.out.println(fixedMax + " " + yearMax);
                break;
            }
        }
    }
}







