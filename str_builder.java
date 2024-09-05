package basic;
public class str_builder {
  public static void main(String[] args) {
    StringBuilder Builder = new StringBuilder();
    for(int i=0;i<26;i++){
        char ch = (char) ('a'+ i);
        Builder.append(ch+" ");
    }
    System.out.print(Builder);
    System.out.println();
    //  System.out.println(Builder.charAt(5));
    // Builder.delete(1,5);
    char dh = Builder.charAt(0);
    System.out.println(Builder);
    System.out.println(dh);
   Boolean x = Builder.isEmpty();
   System.out.println(x);
   Builder.trimToSize();
   int len = Builder.length();
System.out.println(len);  
}
}
