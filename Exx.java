package basic;

public class Exx {
    public static boolean primeFactors(int k){
        for(int i =2 ;i<(int)Math.sqrt(k);i++){
            if( k%3 == 0 || k %5== 0){
                return true;
            }
        }
        return false;
    }
    public static int nthUglyNumber(int n) {
        int m =2;
        int z = 1;
      while(z <=n){
        if(primeFactors(m)){
            m++;
        }
        z++;
      }
    return m;
}
public static void main(String[] args) {

System.out.println(nthUglyNumber(10));

}}