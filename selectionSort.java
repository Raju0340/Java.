package basic;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,8,2};
        for(int i =0;i<arr.length;i++){
            
            int Last = arr.length-1-i;
            int index = maxIndex(arr,Last);
            swap(arr,index,Last);
        }
        System.out.println(Arrays.toString(arr));
}
static int maxIndex(int [] arr,int Last){
int max = 0;
   for(int j=0;j<=Last;j++){
      if(arr[j]>arr[max]){
        max = j;
    }
}
return max;
}
static void swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second]=temp;
}
}
