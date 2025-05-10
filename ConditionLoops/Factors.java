package Dsa_Iterview_questios.ConditionLoops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int factor =1;
        for(int i =1;i<=num;i++)
        {
            factor *=i;
        }
        System.out.println("Factor: " + factor);
    }
}
