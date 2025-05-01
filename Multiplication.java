package Dsa_Iterview_questios;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int multiplication =1;
        for(int i=1;i <=10 ; i++){
            multiplication = num*i;
            System.out.println(num + " * " + i  + " = " + multiplication);
        }
    }
}
