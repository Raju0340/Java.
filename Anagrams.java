package basic;
import java.util.*;

public class Anagrams {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AbstractMap<Character,Integer> map1 = new HashMap<>();
    AbstractMap<Character, Integer> map2 = new HashMap<>();
    
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    str1 = str1.toLowerCase();
    str2 =str2.toLowerCase();
    if(str1.length()!=str2.length()){
        System.out.println("No");
    }
    else{
          for(int i =0;i<str1.length();i++){
             char c = str1.charAt(i);
             if(!map1.containsKey(c)){
                 map1.put(c,0);
             }else{
                 map1.put(c,map1.get(c)+1);
             }
          }
         for(int i =0;i<str2.length();i++){
             char k = str2.charAt(i);
             if(!map2.containsKey(k)){
                 map2.put(k,0);
             }else{
                 map2.put(k,map2.get(k)+1);
             }
          }
      if(map1.equals(map2)) System.out.println("Yes");
        else{
            System.out.println("No");
        }
    }
 }
}
