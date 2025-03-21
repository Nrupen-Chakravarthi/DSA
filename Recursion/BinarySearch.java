package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,9,10};
        int target = 10;
        System.out.println( search(arr, target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        return search(arr, start, end, target);
    }
    static int search(int[] arr, int start, int end, int target){
        int mid = start + (end - start)  / 2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            return search(arr, mid + 1, end, target);
        }
        return search(arr, start, mid - 1, target);
    }
}
