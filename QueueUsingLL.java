package datastructures;

public class QueueUsingLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;

        }
         
    }
    public static class Queue{
        public static Node  Head = null;
        public static Node Tail=null;
    public static  Boolean isEmpty(){
       return Head==null;
    }
       public static  void add(int data){
         Node node = new Node(data);
        if(isEmpty()){

            Head = node;
            Tail= node;
        }
        Tail.next = node;
        Tail = node;
       
       }
       public static void remove(){
        if(isEmpty()){
            System.out.println("The Queue is alredy Empty");
            return;
        }
        Head = Head.next;

       }
      public static void printq(){
        Node temp = Head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp.next!=null);
      }
      public static int peek(){
        int peeked = Head.data;
        return peeked ;
      }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        // q.remove();
        // System.out.println(q.peek());
        
        q.printq();

    }

}
