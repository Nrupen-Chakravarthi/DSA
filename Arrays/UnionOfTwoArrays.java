package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
       int[] a = {1,2,3,4,5};
       int[] b = {1,2,3,4,5,6,7,8,9};
        System.out.println(returnCount(a,b));

    }
    public static int returnCount(int[] a, int[] b){
        int count = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i : a){
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        for (int i : b){
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        return map1.size();
    }
}
