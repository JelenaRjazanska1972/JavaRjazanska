package homework07;


import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Является ли Java языком программирования?");
        System.out.println("Если ответ да, выберите 1 ");
        System.out.println("Выберите 2, если ответ Нет");
        int ques = scanner.nextInt();
        if (ques == 1) {
            System.out.println("Это правильный ответ!");
        } else {
            System.out.println("Это неправильный ответ!");}

            System.out.println("Какая из следующих перечисленных переменных в Java является строковой?");
            System.out.println("Выберите один из трех вариантов ответов: ");
            System.out.println("а  - String");
            System.out.println("b  - int");
            System.out.println("c  - double");
            String answer = scanner.next();

            if (answer.equals("a")) {
                System.out.println("Это правильный ответ!");

            } else {
                System.out.println("Это неправильно!");
            }
            System.out.println("Как называется целочисленная переменная в Java?");
                String answerVar = scanner.next();
                if (answerVar.equals("int")) {
                    System.out.println("Это правильный ответ!");
                } else {
                    System.out.println("Это неправильно!");
                }
                    if ((ques==1) && (answer.equals("a")) || (ques==1) && (answerVar.equals("int")) || (answer.equals("a")) && (answerVar.equals("int"))) {
                        System.out.println("Вы хорошо знаете программирование!");
                    } else {
                        System.out.println("Вам нужно учиться больше!");
                    }scanner.close();
                }

            }




