package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
    int[] permute = {1,2,3};
        System.out.println((Arrays.toString(nextPermutation(permute)))) ;

    }


    public static List<List<Integer>> permutationsList(int[] permute) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), permute);
        return resultList;
    }
    public static int[] nextPermutation(int[] nums){
        int[] output = new int[nums.length];
        int[] temp = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(temp);
        List<List<Integer>> permtslist = permutationsList(temp);
        for(int i = 0; i < permtslist.size(); i++){
            int[] j = ListToArray(permtslist.get(i));
            if(Arrays.equals(j, nums)){
                if(permtslist.size() - i - 1 == 0){
                    return ListToArray(permtslist.getFirst());
                }
                else {
                    return ListToArray(permtslist.get(i+1));
                }
            }
        }
        return new int[3];
    }
    public static int[] ListToArray(List<Integer> list1){
        int[] arr = new int[list1.size()];
        for(int i = 0; i < list1.size(); i++){
            arr[i] = list1.get(i);
        }
        return arr;
    }

    private static void backtrack(List<List<Integer>> resultList,
                                  ArrayList<Integer> tempList, int[] nums) {
        // If we match the length, it is a permutation
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int number : nums) {
            // Skip if we get same element
            if (tempList.contains(number))
                continue;

            // Add the new element
            tempList.add(number);

            // Go back to try other element
            backtrack(resultList, tempList, nums);

            // Remove the element
            tempList.remove(tempList.size() - 1);
        }
    }

}
