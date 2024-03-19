package homework16;

public class VarargsLesson {

    public static void main(String[] args) {
        double [] numberN={10,20,-1};

statistics(numberN);
}
public static void sum (int... numberN){
       if (numberN.length==0){
           System.out.println("NO");
       }else {
        int sum=0;
        for (int i:numberN){
            sum +=i;

        }
           System.out.println("sum " + sum);
}}
public static void statistics(double... numberN){
    double numberMin=numberN[0];
    double numberMax=numberN[0];
    double numberAverage=0;
        if (numberN.length==0){
            System.out.println("NO");
        }else {
    for (double number: numberN){
        if (number <0){
            System.out.println("NO");
            break;
        }else {
            if (number < numberMin) {
                numberMin = number;
            }
            if (number > numberMax) {
                numberMax = number;
            }

             numberAverage +=number;
        }
        numberAverage=numberAverage/numberN.length;
        System.out.println(numberMin);
        System.out.println(numberMax);
        System.out.println(numberAverage);
}}}}












