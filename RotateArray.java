package Dsa_Iterview_questios;

import java.util.Scanner;

public class RotateArray {
    public static void  solution(int[] nums,int k){
        int len=nums.length;
        k=k%len;
        int ans[]=new int[len];
        int j=0;
        for(int i=len-k;i<len;i++)
        {
            ans[j++]=nums[i%len];
        }
        for(int i=0;i<len-k;i++)ans[j++]=nums[i%len];
        j=0;
        for(int i:ans)nums[j++]=i;

    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("fill the nums array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] =  sc.nextInt();
        }
        int k = sc.nextInt();

        solution(nums,k);
    }
}
