package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrangeNumsBySign {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,1,2,3};
//        System.out.println(Arrays.toString(Arrange(nums)));
//        System.out.println(Arrays.toString(Approach2(nums)));
        System.out.println(Arrays.toString(Approach3(nums)));
    }
    public static List<Integer> getPositive(int[] nums){
        ArrayList<Integer> positive = new ArrayList<>();
        for (int num : nums) {
            if (num >= 0) {
                positive.add(num);
            }
        }
        return positive;
    }
    public static List<Integer> getNegative(int[] nums){
        List<Integer> negative = new ArrayList<>();
        for (int i : nums){
            if(i < 0){
                negative.add(i);
            }
        }
        return negative;
    }
    public static int[] Arrange(int[] nums){
        List<Integer> positive = getPositive(nums);
        List<Integer> negative = getNegative(nums);
        int i = 0;
        int j = 0;
        while (i < positive.size() && j < negative.size()){
            nums[i*2] = positive.get(i);
            nums[(j*2)+1] = negative.get(j);
            i++;
            j++;
        }
        return nums;
    }

    //Appraoch 2
    public static int[] Approach2(int[] nums){
        int positive_indx = 0;
        int negative_indx = 1;
//        ArrayList<Integer> result = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int num : nums) {
            if (num >= 0) {
                result[positive_indx] = num;
                positive_indx += 2;
            } else {
                result[negative_indx] = num;
                negative_indx += 2;
            }
        }
        return result;
    }

    //Approach 3 using constant space. itnerchanging the values in the array
    public static int[] Approach3(int[] nums){
        int p = 0;
        int n = 1;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                if(nums[i] > 0){
                    p += 2;
                }
                else {
                    if(p > n){
                        swap(nums, p, n);
                        p += 2;
                    }
                }
            } else {
                if (nums[i] < 0){
                    n += 2;
                }
                else{
                    if(n > p) {
                        swap(nums, p, n);
                        n += 2;
                    }
                }
            }
        }
        return nums;
    }
    public static void swap(int[] nums, int p, int n){
        int temp = nums[p];
        nums[p] = nums[n];
        nums[n] = temp;
    }
}
