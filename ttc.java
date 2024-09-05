package basic;

public class ttc{
   public static void main(String[] args) {
    int N =1234;
    int R = 2;
    int sum=0;
    while(N!=0){
        int rem = N%10;
        sum+=rem;
        N/=10;
    }
    int result = sum*R;
    int fres=0;
    while(result!=0){
        int rem = result%10;
        fres+=rem;
        result/=10;
    }
    System.out.println(fres);
   }
}
