package basic;

import java.util.Scanner;

public class buhahha {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int spaces = 0;
    int[] arr = new int[26];
        boolean flag = true ;
    for(int i =0;i<str1.length();i++){
        char c = str1.charAt(i);
      if(c >= 'a' && c <= 'z'){
            arr[c -'a']++;
      } if (c ==' ' ){
          spaces++;
      }
    }
    System.out.println(spaces);
    for(int i =0;i<str2.length();i++){
        char c = str2.charAt(i);
       if(c >= 'a' && c<='z'){
            arr[c-'a']--;
       }
       if (c== ' '){
           spaces--;
       }
    }
   for(int i=0;i<26;i++){
       if(arr[i]!=0){
           flag = false ;
           break;
       }
       
   }
   
        if(flag && spaces ==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    
    
}
}
