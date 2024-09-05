package basic;
import java.util.Scanner;

public class numbersBetweenChara {
    public static void main(String[] args){
        System.out.println("Enter The String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int soln=0;
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
            if(curr>=48 && curr <=57){
      soln += (curr-48);
            }
        }
        System.out.println(soln);
    }
}
