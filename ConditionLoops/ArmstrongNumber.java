package Dsa_Iterview_questios.ConditionLoops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        //Armstrong number is the sum of the digits which is where each digit power of the digit
        // 153 = 1^3 + 5^3 + 3^3
        int num = sc.nextInt();
        int count=0;

        while (num > 0){
            num = num/10;
            int digit  = num % 10;
            count++;
            System.out.println(digit);
        }

    }
}
