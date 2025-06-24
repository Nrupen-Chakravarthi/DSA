public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        System.out.println(search(nums, 5));
    }
    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[left] <= nums[mid]){
                if (nums[left] <= target && target <= nums[mid]){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if(nums[left] >= nums[mid] && target <= nums[mid]){

                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }
}
