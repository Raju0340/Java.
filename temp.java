import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String str = sc.next();
       int k = sc.nextInt();
       
       System.out.println(str.charAt(n-k));
    }
}

