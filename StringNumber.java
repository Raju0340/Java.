package basic;
import java.util.*;
public class StringNumber {
public static void main(String [] args ){
    System.out.println("Enter a string value");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int product =1;
    for(int i=0;i<str.length();i++){
        int num = str.charAt(i)-'0';
      product*=num;
    }
    System.out.println(product);
    sc.close();;
}
}
