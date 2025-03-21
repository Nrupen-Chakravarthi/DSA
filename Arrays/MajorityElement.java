package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {6,6,7,7,1,6,6};

        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 1;
        for(int i = 1 ;i < nums.length; i++){
            if(nums[i] == element){
                count += 1;
            }
            else if (count == 0){
                element = nums[i];
                count += 1;
            }
            else{
                count -= 1;
            }
        }
        return element;
    }
}
