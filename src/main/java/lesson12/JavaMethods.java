package lesson12;

public class JavaMethods {
    public static void main(String[] args) {
        printGreating();
        printGreatingStudent("Jelena");
        boolean checkResult=checkStudent("Jelena");

    }
    public static void printGreating (){
        System.out.println("Hallo Berlin!!!");
    }
    public static void printGreatingStudent (String studentName){
        System.out.println("Hallo " + studentName);
    }
    public static void printGreatingStudent(String studentName, double groupNumber){
        System.out.println("Hallo " + studentName + "your group" + groupNumber);
    }
    public static boolean checkStudent(String studentName){
        if (studentName.equals("Jelena")) {
            return true;
        }
        else {
    }return false;
}
public static void checkGroupNumber(double groupNumber){
    System.out.println(groupNumber);
    checkGroupNumber(groupNumber);//рекруссия
}
//факториал
public static int getFactorial(int number){
        if (number==1){
            return 1;
        }else {
            return number*getFactorial(number-1);
        }

}
}
