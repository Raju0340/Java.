package basic;
import java.io.*;
public class FISD {
    public static void main(String[] args) throws IOException ,FileNotFoundException{
   
   
    FileInputStream fis = new FileInputStream("ab.txt");
    int data;               
      while( (data = fis.read()) != -1){                             // reads one byte at a time  i.e , returns ascii value of first byte
        System.out.println((char)data);            // returns -1 if there is no data in the file  
      }  

     fis.close();
   
    }

}
