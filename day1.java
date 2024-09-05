package basic;

import java.util.*;


public class day1 {
    public static void main(String[] args) {
        int[] score = {5,1,4,3,2};
        String[] str = findRelativeRanks(score);
       
    }

    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer,String> map = new HashMap<>();
        int n = score.length;
        int [] arr = score.clone();
       String[] list = new String[n] ;
        map.put(1,"Gold Medal");
        map.put(2,"Silver Medal");
        map.put(3,"Bronze Medal");
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

   for(int i=0;i<score.length;i++){
    int j =0;
    while(score[i]!=arr[j]){
      j++;
    }
    if(j<=2){
      list[j]=map.get(j+1);
    }
    else{
      list[j]=""+(j+1);
    }
   }

   for(int k=0;k<list.length;k++)
   System.out.println(list[k]);
    return list ;
   
     }

}
