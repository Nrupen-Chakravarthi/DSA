package Arrays;

import java.util.HashSet;

public class RepeatedNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,1};
//        System.out.println(findDuplicate(nums));
            System.out.println(find_duplciate(nums));
    }
    //this is the brute force method.

    public static int findDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int num = Integer.MIN_VALUE;
        for (int i : nums) {
            hashSet.add(i);
        }
        for(int i : nums){
            if(hashSet.contains(i)){
                hashSet.remove(i);
                continue;
            }
            num = i;
        }
        return num;
    }

    //we can solve this using the better approach also
    public static int find_duplciate(int[] nums){
        int slow = nums[0];
        int fast = nums[nums[0]];

        while (fast != slow){
            if(fast >= nums.length){
                return -1;
            }
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int ptr1 = 0;
        int ptr2 = fast;
        while (ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }

}
