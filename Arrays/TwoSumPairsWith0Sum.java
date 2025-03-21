package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TwoSumPairsWith0Sum {
    public static void main(String[] args) {
        int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        System.out.println((getPairs(arr)));
    }
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            int sum = arr[i] + arr[j];
            if(sum == 0){
                ArrayList<Integer> sol = new ArrayList<>();
                sol.add(arr[i]);
                sol.add(arr[j]);
                result.add(sol);
                while(i < j && arr[i] == arr[i+1]){
                    i++;
                }
                while(i < j && arr[j] == arr[j-1]){
                    j--;
                }
                i++;
                j--;
            }

            if(sum < 0){
                i++;
            }
            else {
                j--;
            }
        }
        return result;
    }
}
