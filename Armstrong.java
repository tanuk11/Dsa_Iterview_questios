package Dsa_Iterview_questios;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int low = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int high = sc.nextInt();

        System.out.println("Armstrong numbers between " + low + " and " + high + ":");
        for (int num = low; num <= high; num++) {
            int sum = 0, temp = num, digits = 0;

            int check = temp;
            while (check != 0) {
                check /= 10;
                digits++;
            }

            while (temp != 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }

            if (sum == num)
                System.out.println(num);
        }
    }
}
