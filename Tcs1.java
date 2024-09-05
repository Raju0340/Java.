public class Tcs1 {

    public static void main(String[] args) {
        int[]  S = {1,2,1};
        int sum = 0;
        if(S.length ==0){
            System.out.println(sum+1);
        }
        int small = Integer.MIN_VALUE;
      for(int i=0;i<S.length;i++){
        int j=i;
        while(i<j){
           
           if(S[i+1]>small){
            small = S[i+1];
            i++;
           }
        }
      }
      sum = sum + small +1;
      System.out.println(sum);
    }
}
