package ArraysStrings;

import java.util.Arrays;

public class ProductOfItself {
    public static void main(String[] args) {
       int[] nums = {1,2,4,6};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

       for(int i = 0; i < nums.length; i++){
           int j = 0;
           int prod = 1;
           while (j < i){
               prod = prod * nums[j++];
           }
           int k = i + 1;
           while (k < nums.length){
               prod = prod * nums[k++];
           }
           ans[i] = prod;

       }
       return ans;
    }
}
