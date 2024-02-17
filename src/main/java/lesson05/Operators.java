package lesson05;

public class Operators {

    public static void main(String[] args) {
// Оператор равенства == вопрос равны ли они? Номер паспорта
        int numberOne = 10;
        int numberTwo = 10;
        boolean isEqual = (numberOne == numberTwo);
        System.out.println(isEqual);
// оператор неравенства != вопрос числа неравны? PIN пример
        int numberThree = 50;
        int numberFour = 60;
        System.out.println(numberThree != numberFour);

        // оператор больше > лимит
        System.out.println(numberThree > numberFour);
        // оператор <
        System.out.println(numberThree < numberFour);
        // больше или равно (возраст)комбинированный >=
        System.out.println(numberOne >= numberTwo);
        // меньше или равно (возраст)комбинированный <=
        System.out.println(numberOne <= numberTwo);

        // сравнить строковое содержание .equals (nameTwo) когда строчные переменные
        String nameOne = "Mustermann";
        String nameTwo = "Musterman";
        boolean isEqualNameOneNameTwo = nameOne.equals(nameTwo);
        //System.out.println(nameOne.equals (nameTwo));
        System.out.println(isEqualNameOneNameTwo);
        /*
        AND &&
        false && false --> false
        false && true  --> false
        true && false  --> false
        True && true   --> true
         */
        /*
        OR ||
        false || false --> false
        false || true  --> true
        true || false  --> true
        true || true   --> true
         */
// условные операторы && оба условия должны быть соблюдены Bank 1
        int age = 20;
        int salary = 10000;
        boolean pass = true;
        boolean hasCredit;
        if (age >= 21 && salary > 2000 && pass == true) {
            System.out.println("Positiv");
            hasCredit = true;
        } else {
            System.out.println("Negativ");
            hasCredit = false;
        }
        System.out.println("Credit: " + hasCredit);
        //Bank 2
        if (age >= 21 || salary > 3000){
            hasCredit = true;
    }
            else
    {
        hasCredit = false;
    }
                  System.out.println("Credit 2: " + hasCredit);

            int numberA = 4;
            int numberB = 20;
            boolean checkResult = false;
            if (numberA > 10 || numberB>15) {//false||true --> true
                checkResult = true;

            }
            if (numberA>10 && numberB >15){//false && ture --> false
                checkResult = false;
            }
        System.out.println("checkResult -->" + checkResult);

            double accountBalance = 2000000;
            boolean accountActive = false;
            double amountToWithdraw = 6000.0;
            boolean transactionSuccess = false;

            if(accountActive && accountBalance >= amountToWithdraw){
                accountBalance = accountBalance - amountToWithdraw;
                transactionSuccess = true;
                System.out.println("Transaction: " + "Balance: " + accountBalance);
            }
            else {
                System.out.println("ERROR!!!" + transactionSuccess);
                System.out.println("Transaction: " + "Balance: " + accountBalance);
            }
            //false                                                 //true
        if(accountActive && accountBalance >= amountToWithdraw || accountBalance>= 1000000){
            accountBalance = accountBalance - amountToWithdraw;
            transactionSuccess = true;
            System.out.println("Transaction: " + "Balance: " + accountBalance);
        }
        else {
            System.out.println("ERROR!!!" + transactionSuccess);
            System.out.println("Transaction: " + "Balance: " + accountBalance);
        }
        }
    }




