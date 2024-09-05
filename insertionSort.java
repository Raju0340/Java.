package basic;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
       int len = arr.length-2;
        for(int i=0;i<=len;i++){
        for(int j=i+1;j>0;j--){
          if(arr[j]>arr[j-1]){
            int temp = arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
          }
          else{
            break;
          }
        }
    }
        System.out.println(Arrays.toString(arr));
    }
}
