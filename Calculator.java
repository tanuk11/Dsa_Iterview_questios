package Dsa_Iterview_questios;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextInt();
        System.out.println("Enter second number");
        double b = sc.nextInt();
        System.out.println("Enter chararcters(+,-,*,/) ");
        char op = sc.next().charAt(0);

        if(op == '+')
        {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a-b);
        } else if (op == '*') {
            System.out.println(a*b);
        }else{
            System.out.println(a/b);
        }
    }
}
