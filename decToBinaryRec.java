package basic;

public class decToBinaryRec {


public static String convert(int decimal) {
    if (decimal == 0) {
      return "";
    }
    return convert(decimal / 2) + (decimal % 2);
  }

  public static void main(String[] args) {
    int num = 15;
    String binary = convert(num);
    System.out.println("Binary equivalent of " + num + " is " + binary);
  }}