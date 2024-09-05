package basic;


public class neww2 {
public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
   int [] a = arr.clone();
    a[0]=100;
    for(int i =0 ;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    for(int i =0 ;i<a.length;i++){
        System.out.print(a[i]+" ");
    }

}
}
