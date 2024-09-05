package basic;
import java.util.Arrays;
public class QuickSort {
public static void main(String[] args) {
    int[] arr = {5,2,1,4,3};
    int low =0;
    int high = arr.length-1;
     quicksort(arr, low ,high);
     System.out.println(Arrays.toString(arr));
}
public static void quicksort(int[] arr, int low, int high) {
    if(low>=high){
        return;
    }

    int pivot = low+high/2;
    int s = low;
    int e = high;
    while ((s<=e)) {
        while(arr[s]<arr[pivot]){
            s++;
        }
        while(arr[e]>arr[pivot]){
        e--;
    }
    if(s<=e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e]=temp;
        s++;
        e--;
    }
    }
    quicksort(arr,low,e);
    quicksort(arr, s, high);
}
}
