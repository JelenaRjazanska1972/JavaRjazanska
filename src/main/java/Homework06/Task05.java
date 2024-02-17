package Homework06;
import java.util.Scanner;
public class Task05 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

System.out.println("Введите текущий час ");
int hour = scanner.nextInt();
        System.out.println("Введите текущие минуты ");
        int min = scanner.nextInt();
if (hour >=7 && hour!=13)
    if (min>0 && min <=45)
{System.out.println("Идет урок");
        }else
            if (hour >=7 && hour!=13)
    if (min>45 && min <=60){
        System.out.println("Перемена");
    }
    else{
        if (hour==13)
        if (min>=0 && min<=30)
        {System.out.println("Обед ");
    }
        else {
                System.out.println("Свободное время");
            }
        }
    }}
