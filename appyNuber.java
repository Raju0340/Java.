package basic;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class appyNuber {

private static int Square(int n){
    int sum=0;
    while(n>0){
    int rem = n%10;
    sum+=rem*rem;
    n/=10;
    }
    return sum;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");

    int N = sc.nextInt();
    int slow = Square(N);
    int fast = Square(Square(N));
   
    do{
        slow = Square(slow);
        fast = Square(Square(fast));

    }while(fast!=slow);
    if(fast==1){
        System.out.println("Happy Number");
    }else{
        System.out.println("Not a Happy Nuuber");
    }
}
}
