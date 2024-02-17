package lesson03;

//сигнатура класса
public class Variables {
    //-128 до 127 1 байт хранит только числа
    //даем название переменной  - декларируем переменную если задаем значение переменной перемен приняла значение 51
    static byte age = 51;
    //-32768 до 32767 2 байта только числа
    static short price = 10000;
    // -2147483648 до 2147483647 4 байта
    static int number = 200000;
    // -9223372036854775808 lj 9223372036854775807
    static long bigNumberPeople = 34343434343343343L;
    //дробные числа, с плавающей точкой
    static float euroPrice = 0.85f;
    //дробные числа, с плавающей точкой и больший обьем памяти чем флот
    //ограничен 2 знака
    static double dollarPrice = 0.85;
    //символ
    static char charLetter = 'A';
    //логические (да или нет)
    //false
    static boolean result = true;
    //выше примитивные типы переменных
//След не примитивные поэтому с большой буквы
    static String text = "Hallo Java";

    // конфигурация метода
    public static void main(String[] agrs) {
        //тело метода набор команд
        //значение переменной age
        System.out.println("Возраст" + age);
        System.out.println("Курс валюты евро/доллар" + euroPrice);
        System.out.println(charLetter);
        System.out.println(text);
        System.out.println(result);
        System.out.println(number);

        System.out.println("Возраст" + age);
    }

}
