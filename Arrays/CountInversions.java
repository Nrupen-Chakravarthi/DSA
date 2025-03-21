package Arrays;

public class CountInversions {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
        System.out.println(count(arr));
    }
    public static int count(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
