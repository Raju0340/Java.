package basic;

import java.util.ArrayList;
import java.util.*;

public class arraylist {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
   //    ArrayList<Integer> list = new ArrayList<>(10);
   ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
      //    list.add(10);
   //    list.add(20);
//    list.add(30);
   //    list.add(40);
//    list.add(50);
for(int i=0;i<2;i++){
list1.add(new ArrayList<>());     //  [[],[]] craetes empty array lists in an array list
}
   for(int i=0;i<2;i++){
      for(int j =0;j<3;j++){
         list1.get(i).add(sc.nextInt());
      }
   }
   
System.out.println(list1);
      //  for(int i = 0;i<5;i++){
   //     list.add(sc.nextInt());
   //  }
   //    System.out.println(list);
   //    System.out.println(list.size());
   //    list.remove(2);
   //    System.out.println(list);
   //    for(int i=0;i<list.size();i++){
   //     System.out.println(list.get(i));
   //    }
      
   }
}
