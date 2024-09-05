package datastructures;



import java.util.*;



public class abstractMap {
public static void main(String[] args) {
    HashMap<Integer,Character> am = new HashMap<>();
    AbstractMap<Integer,Character> a = new HashMap<>();     // right Side should be HashMap
    am.put(1,'a');
    am.put(2, 'a');
    a.put(1,'a');
    a.put(2, 'c');
    //System.out.println(am.equals(a));
    am.getOrDefault(am.get(4),'x');
   Object [] ar = am.values().toArray();
    System.out.println();
    am.putIfAbsent(1, 'm');
    Arrays.b

}}
