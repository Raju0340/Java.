package oops;

public class inheritance {
  public static void main(String[] args) {
   boxwt Boxwt = new boxwt(1,1,1,1);
   box Box = new box(1,2,3);
   double v,w;
   v  = Box.volume();
   w = Boxwt.volume();
   System.out.println((v+"  "+w));

  }
}
