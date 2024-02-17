package lesson03;

public class Calculator {
    static int numberOne = 100;
    static int numberTwo = 50;

    public static void main(String[] agrs) {
// вызвать метод - указать название метода
        //можно переписать значение переменной
        System.out.println(addition(numberOne, numberTwo));
        System.out.println(multipication(numberOne, numberTwo));
    }
    public static int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int multipication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    //сделали не в методе
    //результат приниает что не заданные значения а любые другие
    //любые два числа инт

}
