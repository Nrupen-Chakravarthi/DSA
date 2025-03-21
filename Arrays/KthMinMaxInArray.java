package Arrays;

public class KthMinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(KthMin(arr, 3
        ));

    }
    public static int KthMin(int[] arr, int k){
        int min = arr[0];
        for(int i : arr){
            if(k > 0) {
                if (i < min) {
                    min = i;
                    k--;
                }
            }
        }
        return min;
    }
    public static int KthMax(int[] arr, int k){
        int max = arr[0];
        for(int i : arr){
            if(k > 0){
                if(i > max){
                    max = i;
                }
            }
        }
        return max;
    }
}
