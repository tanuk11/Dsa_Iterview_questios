package Dsa_Iterview_questios;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        boolean leap =(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(leap){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
