public class LL{
    Node Head;
    Node Tail;
    int Size = 0;
    public static int lengthll(Node node){
      int count =0;
      Node temp = node;
      while(temp!=null){
        temp=temp.next;
        count++;
    }
    return count;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = Head;
        Head = node;
        if(Tail == null){
            Tail = Head;
            
        }
        Size+=1;
    }
    public void deleteFirst(){
      
      Head = Head.next;
    }
    public void deleteLast(){
      Node temp = Head;
      while(temp.next.next!=null){
        temp = temp.next;
      }
      temp.next = null;
    }
    public void insertLast(int value){
      Node temp = Head;
      Node node = new Node(value);
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = node;
      Tail = node;

    }
  public void insert(int value,int index){

     if(index==0){
       insertFirst(value);
       return;
     }
     if(index == Size){
      insertLast(value);
     }
     Node temp = Head;
     for(int i=1;i<index;i++){
      temp = temp.next;
     }
     Node node = new Node(value);
     node.next = temp.next;
     temp.next = node;


  }
  public void cycle(){
   Tail.next = Head;
  }
    // private Node find(int value){
    //   // int index=0;
    //   Node temp = Head;
    //   while(temp != null){
    //     if(temp.value == value){
    //       // return index;
    //       return temp;
    //     }
    //     temp = temp.next;
    //     // index++;
      
    //   }
    //   return null;
     
    // }
    public void display(){
       Node temp = Head;
       while(temp != null){
        System.out.print(temp.value+"--->");
        temp = temp.next;
       }
       System.err.print("END");
}
public Node removeNthFromEnd(Node head, int n) {
  Node temp = head;
  int count=0;
  while(temp!=null){
      temp = temp.next;
      count++;
  }
  if(count==2){
    head.next = null;
  }
else{ 
int del = count - n;
int c=0;
Node temp1 = head;
while(c<del){
temp1 = temp1.next;
c++;
}
  temp1.next = temp1.next.next;
}
return head;
}

   public class Node{
      public  int value;
      Node next;
      Node(int value){
        this.value = value;

      }
      Node(int value,Node next){
        this.value = value;
        this.next= next ;
      }
   }
  public static void main(String[] args) {
    LL ll = new LL();
    // ll.insertFirst(25);
    // ll.insertFirst(24);
    ll.insertFirst(23);
    ll.insertLast(25);
   ll.display();
  // ll.removeNthFromEnd(ll.Head, 2);
  //  System.out.println();
  //  ll.display();
  //  System.out.println();
  //  System.out.println(lengthll(ll.Head));
  }
    }

     

