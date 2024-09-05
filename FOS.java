package basic;
import java.io.*;
public class FOS {
public static void main(String[] args) throws IOException,FileNotFoundException {
    FileOutputStream fos = new FileOutputStream("n1.txt");
    fos.write(97);
    fos.close();
}
} 
