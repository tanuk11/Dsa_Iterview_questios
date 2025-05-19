package Dsa_Iterview_questios.ConditionLoops;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {10,20,30,40};
        int sum = 0;
//        for (int n : nums) sum += n;
//        double avg = (double) sum / nums.length;

        double avg = Arrays.stream(nums).average().orElse(0);
        System.out.println(avg);

    }
}
