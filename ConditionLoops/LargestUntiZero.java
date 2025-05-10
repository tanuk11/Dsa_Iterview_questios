package Dsa_Iterview_questios.ConditionLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestUntiZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int largest  = 0, input;

        while((input = sc.nextInt()) != 0){
            if(input > largest){
                largest = input;
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}
