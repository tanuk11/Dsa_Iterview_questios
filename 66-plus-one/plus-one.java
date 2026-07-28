class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int n=digits.length;
        int i=n-1;
        while(carry!=0 && i>=0){
            if(digits[i]+carry<10){
                digits[i]+=carry;
                carry=0;
                continue;
            }
            int num=digits[i]+carry;
            int digit=num%10;
            digits[i]=digit;
            carry=1;
            i--;
            }
            if(carry==0){
                return digits;
            }else{
                int [] arr=new int[n+1];
                arr[0]=carry;
                for(int k=1;k<n;k++){
                    arr[k]=digits[k];
                }
                return arr;
            }

        }

        
    }