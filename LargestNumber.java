package Dsa_Iterview_questios;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("Largest number is " + a);
        }else if(b > a){
            System.out.println("Largest number is " + b);
        }else{
            System.out.println("Both are equal");
        }
    }
}
