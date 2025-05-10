package Dsa_Iterview_questios.ConditionLoops;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers(0 to stop)");
        int sum =0, num;

        while((num = sc.nextInt()) != 0){
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
