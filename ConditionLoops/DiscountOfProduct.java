package Dsa_Iterview_questios.ConditionLoops;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 500, discount = 10;
        double finalPrice = price - (price * discount / 100);
        System.out.println(finalPrice);
    }
}
