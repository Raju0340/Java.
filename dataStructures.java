package basic;


public class dataStructures {
   
    
    public static void main(String[] args) {
        String str = "Raju";
        str.toUpperCase();
    StringBuilder y = new StringBuilder("Raaj");
    y.append(" Reddy");
    System.out.println("After appending "+y);    
    
    
    y.insert(5,"Hi ");
    System.out.println("After inserting "+y);


    y.delete(1, 02);
    System.out.println("After deleting "+y);

    
    System.out.println(y.reverse()); 

  
}
}
