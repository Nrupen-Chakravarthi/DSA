package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayContainingNumsMoreThanWithNKTimes {
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,1,2,3,5};
        System.out.println(getNumList(nums, 4));
    }

    public static List<Integer> getNumList(int[] nums, int k){
        List<Integer> ans = new ArrayList<>();
        int limit = nums.length / k;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int j = 0;
            int count = 1;
            while (j < nums.length){
                if(i == j){
                    j++;
                }
                else {
                    if(num == nums[j]){
                        count += 1;
                        j++;
                    }
                    else {
                        j++;
                    }
                }
            }
            if(count > limit){
                if(!ans.contains(num)) {
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}
