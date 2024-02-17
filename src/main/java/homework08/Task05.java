package homework08;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOne=scanner.nextInt();
        int n =(numberOne/1000);
            System.out.println(n);
            int n1=(((numberOne-(1000*n))/100));
        System.out.println(n1);
        int n2 =(((numberOne-(1000*n))-(100*n1))/10);
        System.out.println(n2);
        int n3 =((numberOne-(1000*n))-(100*n1)-(10*n2));
        System.out.println(n3);
int result=(n+n1+n2+n3);
System.out.println(result);

    }}

