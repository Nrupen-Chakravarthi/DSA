package Arrays;

import java.rmi.dgc.VMID;
import java.util.ArrayList;

public class SmallestSumWithSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
//        System.out.println(smallestSubWithSum(51, arr));
        System.out.println(getSmallestSubArray(arr, 7));
    }


    public static int getSmallestSubArray(int[] nums, int k){
      int left = 0;
      int min_window = Integer.MAX_VALUE;
      int curr_sum = 0;
      for(int right = 0; right < nums.length; right++){
          curr_sum = curr_sum + nums[right];

          while (curr_sum >= k){
              min_window = Math.min(min_window, right - left + 1);
              curr_sum = curr_sum - nums[left];
              left++;
          }
      }
      return min_window == Integer.MAX_VALUE ? 0 : min_window;
    }


    //brute Force Approach
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > x){
                ans.add(arr[i]);
                return ans.size();

            }
            for(int j = i + 1;j < arr.length; j++){
                if(arr[j] > x){
                    ans.add(arr[j]);
                    return ans.size();
                }
                if(arr[i] + arr[j] > x){
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                    return ans.size();
                }
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[k] > x){
                        ans.add(arr[k]);
                        return ans.size();
                    }
                    if(arr[i] + arr[j] + arr[k] > x){
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[k]);
                        return ans.size();
                    }
                }
            }

        }
        return 0;
    }

    //Optimal Solution O(n)

}
