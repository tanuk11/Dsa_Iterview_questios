package Dsa_Iterview_questios.ConditionLoops;

import java.util.Scanner;

public class SubProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product =1;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            product *= digit;
            sum += digit;
            num /= 10;
        }

        int result = product - sum;
        System.out.println("product: " + product +" " + "sum: " + sum + " "+ "result: " + result);



    }
}
