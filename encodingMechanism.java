package Accenture;

import java.util.*;

public class encodingMechanism {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String str3 = sc.nextLine();
     String [] arr = new String[3];
     arr[0] =  str1;
     arr[1] = str2;
     arr[2]= str3;
     String s1 = "";
     String s2 = "";
     String s3 = "";

    
    // int len1 = str1.length();
    // int len2 =str2.length();
    // int len3 = str3.length();
    for(int i=0;i<3;i++){
        int len = arr[i].length();
      if(len%3 == 0){
            for(int j =0 ;j<3;j++){
               s1 = s1+ arr[i].substring(i, len)
            }
      }
      if(arr[i].length()%3 == 1){
        
      }
      if(arr[i].length()%3 == 2){
        
      }
    }
}   
}
;
