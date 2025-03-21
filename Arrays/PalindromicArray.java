package Arrays;

public class PalindromicArray {
    public static void main(String[] args) {
        int[] nums = {111, 222, 333, 444, 555};
        System.out.println(isPalindromeOrNot(nums));
    }
    public static boolean isPalindromeOrNot(int[] nums){
        for(int i : nums){
            if(checkIfPalindrome(i)){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfPalindrome(int num) {
        String str = Integer.toString(num);
        int i = 0;
        int j = str.length() - 1;
        while(i<=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }

}
