package Dsa_Iterview_questios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String reverse = "";
        for(int i =str.length() -1; i>=0; i--)
        {
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }


    }
}
