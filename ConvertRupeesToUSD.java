package Dsa_Iterview_questios;

import java.util.Scanner;

public class ConvertRupeesToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rupees to convert");
        double rupee = sc.nextInt();
        double usd = 83;

        System.out.println("usd: " + rupee/usd);

    }
}
