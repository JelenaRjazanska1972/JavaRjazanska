package Homework05;

public class Task02 {
    public static void main(String[] args) {
        int x=10;
        int y = 20;
        int z = 30;
        boolean isBetween;
        if (x < y && y < z) {
            isBetween = true;
            System.out.println(isBetween);
        }
        else {
            isBetween = false;
            System.out.println(isBetween);
        }
    }
}
/* public static void main(String[] args) {
        int numberX = 20;
        int numberY = 6;
        int numberZ = 15;
boolean checkResult;
        if ((numberX < numberY) && (numberY < numberZ)) {
            System.out.println(checkResult=true);

        } else {
            System.out.println(checkResult=false);
        }

    }}*/