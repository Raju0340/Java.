package basic;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String [] args){
        int arr[] = { 1,1,2,2,2,3,3};
        int j =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j++]=arr[i];
            }
        }

        for(int k =0;k<j;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
