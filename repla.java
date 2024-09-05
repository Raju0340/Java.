package basic;

public class repla {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
       
        s = s.replaceAll("[^a-z A-Z]",""); 
        s =s.replaceAll(" ", "");
        s = s.toLowerCase();
        System.out.println(s);
    }

}
