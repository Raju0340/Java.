import java.util.ArrayList;
import java.util.Stack;

public class al {
public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(20);
    al.add(25);
   
  ArrayList<Integer> al2 = new ArrayList<>();
//   al2.add(3);
//   al2.add(4);
  al.addAll(al2);
  al.set(0, 100);
  System.out.println(al.contains(25));

   System.out.println(al.isEmpty());
  Stack<Integer> st = new Stack<>();
  st.push(2);
  st.push(3);
  st.push(4);
  System.out.println(st.search(12));

}
}
