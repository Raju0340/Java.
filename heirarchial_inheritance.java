package oops;

public class heirarchial_inheritance {
public static void main(String[] args) {
    b obj = new b();
    // obj.method_a();
    // obj.method_b();
       obj.i=10;     
    C obj1 = new C();
    A obj2 = new A();
    System.out.println(obj2.i);
    System.out.println(obj.i);
    System.out.println(obj1.i);
}
}
