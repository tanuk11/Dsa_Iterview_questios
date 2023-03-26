package Dsa_Iterview_questios;

import java.util.Scanner;

public class RemoveDuplicates {

    public static int solution(int[] nums){
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1])
            {
                nums[count] = nums[i+1];
                count++;
            }
        }

        return count;


    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
         System.out.println("fill the nums array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] =  sc.nextInt();
        }

        System.out.println(solution(nums));
    }
}
