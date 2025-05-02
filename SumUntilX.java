package Dsa_Iterview_questios;

import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String input;

        System.out.println("Enter numbers to sum. Type 'x' to stop.");

        while (true) {
            input = sc.next();

            if (input.equals("x") || input.equals("X")) {
                break;
            }

            // Assume user enters valid numbers
            int num = Integer.parseInt(input);
            sum += num;
        }

        System.out.println("Total sum: " + sum);
    }
}
