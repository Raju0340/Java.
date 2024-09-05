
package basic;
import java.util.*;
import java.util.Collections;

public class ArrayList1 {
    
public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    int[] a = {1,2,3};

    ArrayList<Integer> AL = new ArrayList<>();
    AL.add(a[0]);
    int[] arr = {1,2,3,4,4};
    AL.add(20);
    AL.add(2);
    AL.add(40);        // .get()   .remove()
    AL.add(40);        // .size()   .clear()
    AL.add(60);  
          //  .add()    .set()
AL.add(0,5);
System.out.println(AL);
set.addAll(AL);
System.out.println(set);
}
}
