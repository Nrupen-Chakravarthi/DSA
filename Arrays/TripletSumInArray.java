package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class TripletSumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(getTriplet(arr, 13));
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> res = new ArrayList<>();
    }
    public static boolean getTriplet(int[] arr, int target){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] > target){
                        break;
                    }
                    if(arr[i] + arr[j] + arr[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
