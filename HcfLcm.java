package Dsa_Iterview_questios;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
         int hcf =1;

         for(int i=1; i<= Math.min(a,b);i++){
             if(a % i == 0 && b % i == 0){
                 hcf =i;
             }
         }
         int lcm = (a*b)/hcf;

        System.out.println("HCF =" + hcf + " LCM =" + lcm);
    }
}
