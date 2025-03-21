package Arrays;

public class Sort012UsingConstantSpace {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,2,2,1};
        sort(arr);
        for(int i : arr){
            System.out.println(i);;
        }
    }
    //we are solving this using ducth national flag algo
    //we will take 3 variables
    //int start(pts at start), int mid(pts at start), int end(points to last index of arr)
    //from start using mid if we find 2 at 0, swap with end,
    //if we find 1 put start there only and take mid++
    //exit condition is mid <= end
    public static void sort(int[] arr){
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        while (mid<=end){
            if(arr[mid] == 2){
                swap(arr, mid, end);
                end--;
            }
            if(arr[mid] == 0){
                swap(arr, mid, start);
                mid++;
                start++;
            }
            if (arr[mid] == 1)
            {
                mid++;
            }
        }
    }
    public static void swap(int[] arr, int mid, int end){
        int c = arr[mid];
        arr[mid] = arr[end];
        arr[end] = c;
    }
}
