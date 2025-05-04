package Dsa_Iterview_questios;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal");
        int p = sc.nextInt();
        System.out.println("Enter Rate");
        int r = sc.nextInt();
        System.out.println("Enter time");
        int t = sc.nextInt();

        float simpleInterest = 0;
        simpleInterest = p * r * t /100;
        System.out.println("SimpleInterest = "+ simpleInterest);
    }
}
