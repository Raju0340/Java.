package Accenture;

public class shiftEvenOdd {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int p = -1;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]%2 ==0){
                p++;
                int temp = arr[i];
                int k =i;
                 while(k>p){
                    //right shift
                    arr[k] = arr[k-1];
                    k--;
                 }
                 arr[p]= temp;
            }
        
    }
    for(int k =0;k<5;k++)
        System.out.print(arr[k]+" ");

}}
