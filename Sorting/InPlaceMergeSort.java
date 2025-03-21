    package Sorting;

    public class InPlaceMergeSort {
        static int count = 0;
        public static void main(String[] args) {
        int[] arr = {2, 3 ,4 ,5 ,6};
        mergeSort(arr, 0, 4);
        for(int i : arr){
            System.out.println(i);
        }
            System.out.println("Count is: "+count);
        }
        public static void  mergeSort(int[] arr, int start, int end){
            if(end - start == 0){
                return;
            }
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
        public static void merge(int[] arr, int start, int mid, int end){
            int[] mix = new int[end - start + 1];
            int i = start;
            int j = mid+1;
            int k = 0;

            while (i <=mid && j <= end){
                if(arr[i] < arr[j]){
                    mix[k++] =  arr[i++];
                }
                else {
                    for (int t = i; t <= mid; t++) {
                        System.out.println("Inversion is between: " + arr[t] + " and " + arr[j]);
                    }
                    mix[k++] = arr[j++];
                    count = count + (mid - i + 1);

                }
            }
            while (i <= mid){
                mix[k++] = arr[i++];
            }
            while (j <= end){
                mix[k++] = arr[j++];
            }
            for(int l = 0; l < mix.length; l++){
                arr[start+l] = mix[l];
            }
        }
    }
