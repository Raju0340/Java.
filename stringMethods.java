package basic;

import java.util.ArrayList;
import java.util.List;

public class stringMethods {
    public static long factorial(int n) {
		if(n==0  || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
    	public static int coefficient(int n ,int k) {
		int  ans =(int) ((int) factorial(n)/(factorial(n-k)*factorial(k)));
		return ans;
	}
    public static  List<List<Long>> generate(int n) {
      List<List<Long>> list = new ArrayList<>();
        
		for(int i =1;i<=n;i++){
            List<Long> list1 = new ArrayList<>();
           for(int j=1;j<=i;j++){
           
            long res = coefficient(i-1, j-1);
                  list1.add(res);
           }
           list.add(list1);
        }
        return list;
	}
    public static void main(String[] args) {
        List<List<Long>> list = new ArrayList<>();
       list = generate(14);
       System.out.println(list);
       
    }
}

