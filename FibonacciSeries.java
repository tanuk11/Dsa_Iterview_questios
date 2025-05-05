package Dsa_Iterview_questios;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

        int a = 0;
        int b =1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for(int i = 3; i <= n ;i++){
           int c = a + b;
           System.out.print(c + " ");
           a = b;
           b = c;
        }



    }
}
