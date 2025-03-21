package Recursion;

import java.util.ArrayList;

public class LinearSearchMultipleOccurences {
    public static void main(String[] args) {
        int[] nums = {4,9,2,4,6,4};
        System.out.println( search(nums, 4, 0));
//        System.out.println(arr);

    }
    static ArrayList<Integer> arr = new ArrayList<>();
    public static ArrayList<Integer> search(int[] nums, int target, int start){
        if(start == nums.length){
            return arr;
        }
        if(nums[start] == target){
            arr.add(start);
        }

        return search(nums, target, start + 1);
    }
}
