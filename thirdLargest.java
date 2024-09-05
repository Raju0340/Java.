public class thirdLargest {
public static void main(String[] args){
    int[] arr = {99,100,2000,400};
    int f = arr[0];
    int s = Integer.MIN_VALUE;
    int t = Integer.MIN_VALUE;
    for(int i=1;i<arr.length;i++){
        if(arr[i]>f){
            s=f;
            f = arr[i];

        }
        else{
            if(arr[i]>s){
                t=s;
                 s= arr[i];
            }
            else{
                t = arr[i];
            }
        }

    }
    System.out.println(t);
}
}
