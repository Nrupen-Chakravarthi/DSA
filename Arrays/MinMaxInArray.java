package Arrays;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3};
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
