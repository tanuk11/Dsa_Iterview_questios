package Dsa_Iterview_questios;

public class PowerOfTwo {
    public static boolean powerOfTwo(int n){
        int count = 0;
        while(n > 0){
            if (n % 2 == 1) count++;
            n = n/2;
        }
        return count == 1;
    }
    //Main Function
    public static void main(String[] args){
        int n = 4;
        if (powerOfTwo(n)) System.out.println("Yes");
        else{
            System.out.println("No");
        }
    }
}
