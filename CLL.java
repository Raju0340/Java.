package basic;
public class CLL {
 class Node{
    int value;
    Node next;
    public char[] data;
    Node(int data){
        this.value = data;
    }
}
    Node head = null;
    Node tail = null;

    void add(int data){
        Node node = new Node(data);
        if(head==null){
           head = node;
           tail=node;
        }
        tail.next = node;
        tail = node;
        tail.next = head;
  }

    void display(){
        if(head==null){
          System.out.println("LL is Empty");
        }
        Node temp;
        temp = head;
        do{ 
            System.out.print(temp.value+"-->");
            temp = temp.next;

        }while(temp.next!=head.next);
        System.out.println();
    }

public static void main(String[] args) {
    CLL cl = new CLL();
    cl.add(1);
    cl.add(2);
    cl.add(3);
    cl.add(4);
    cl.add(5);
    cl.add(6);
    cl.add(7);
    cl.add(8);
    cl.add(9);
    cl.add(10);

    cl.display();

   Node curr = cl.head;
   Node nex = cl.head.next;
   while(curr!=nex){
    curr.next = nex.next;
    curr = curr.next;
    nex = curr.next;

   }

    System.out.println(curr.value);
    

}
}
