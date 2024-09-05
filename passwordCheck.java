import java.util.*;
public class passwordCheck {

    public static int checkPassword (String str, int n)
    {
        //Fill your code here
   int cap =0;
      int num =0 ;
      
     if(n>=4){
          if(str.charAt(0)>=48 && str.charAt(0)<=57) return 0;
         for(int i=0;i<n;i++){
             if(str.charAt(i) >= 48 && str.charAt(i)<=57) num++;
             if(str.charAt(i)>=97 && str.charAt(i)<=122) cap++;
             if(str.charAt(i) ==' ' || str.charAt(i)=='/')  return 0;
         }
     }else{
         return 0;
     }
      if(cap == 0 || num ==0) return 0;
      return 1;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      String str = sc.next ();
      System.out.println (checkPassword (str, str.length ()));
  }
}
