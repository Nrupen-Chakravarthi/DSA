package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class WhetherArrayIsASubSetOrNot {
    public static void main(String[] args) {
           int[] a = {1,1 ,2,2};
       int[] b= {1,1};
        System.out.println(checkForSubArray(a, b));
//        System.out.println(checkForSubArray(a, b));
    }
    public static boolean checkForSubArray(int[] a, int[] b){
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i : a){
            ans.put(i, ans.getOrDefault(i, 0) + 1);
        }
        for(int i : b){
            if(ans.containsKey(i) && ans.get(i) >= 1){
                ans.put(i, ans.get(i) - 1);
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
