package Dsa_Iterview_questios.ConditionLoops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Unit");
        double unit  = sc.nextInt();
        double bill = 0;
        if(unit <= 100){
            bill = unit * 1.5;
        } else if (unit <= 200) {
            bill = 100 * 1.5 + (unit - 100) * 2;
        }else {
            bill = 100 * 1.5 + 100 * 2 + (unit - 200) * 3;
        }

        System.out.println("Electricity Bill: Rs. " + bill);

    }
}
