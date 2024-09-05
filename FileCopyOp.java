package basic;
import java.io.*;
import java.util.*;


public class FileCopyOp {
    public static void main (String[] args) throws IOException , FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Source File");
         String src =   sc.nextLine();
         System.out.println("Enter destination File");
         String dest =   sc.nextLine();
    FileInputStream fis = new FileInputStream(src);
    FileOutputStream fos = new FileOutputStream(dest);
    int data;
    while ((data = fis.read())!= -1) {
        fos.write(data);
        
    }
    fos.close();
    fis.close();
    System.out.println("Data transmission Successful");
  sc.close();
    }

}
