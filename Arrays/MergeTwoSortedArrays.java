package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};
        sort_Arrays(arr1, arr2);
    }
    public static void sort_Arrays(int[] arr1, int[] arr2){
        int i = arr1.length - 1;
        int j = 0;
        while (i >= 0 && j <= arr2.length - 1){
            if(arr1[i] > arr2[j]){
                swap(arr1, arr2, i, j);
                i--;
                j++;
            }
            else {
                i--;
                j++;
            }
        }
    }

    private static void swap(int[] num1, int[] num2, int i, int j) {
        int temp = num1[i];
        num1[i] = num2[j];
        num2[j] = temp;
    }
}
