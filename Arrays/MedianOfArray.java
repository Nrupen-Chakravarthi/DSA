package Arrays;

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] nums = {56, 67, 30, 79};
        System.out.println(findMedian(nums));
//        System.out.println(5/2);
    }
    public static double findMedian(int[] arr){
        Arrays.sort(arr);
        if(arr.length % 2 == 1){
            return (double) arr[arr.length / 2];
        }
        else {
            return (double) (arr[arr.length /2] +  arr[arr.length / 2 - 1]) / 2;
        }
    }
}
