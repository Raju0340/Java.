package datastructures;

import datastructures.StackUsingLL.Node.Stack;

// import javax.xml.crypto.Data;

public class StackUsingLL {
    static class Node{
        int data;
        Node next;
     public Node(int data){
         this.data = data;
        next = null;
    }
   
      static class Stack{
      public static Node Head;
         public static Boolean isEmpty(){
        return Head == null;
    }
        
     public static void push(int a){
         Node node = new Node(a);
        if(isEmpty()){
           Head = node;
           return;
        }
        node.next = Head;
        Head = node;
     }
     public static int pop(){
        if(isEmpty()){
            System.out.println("THe Stack is Empty");
            return -1;
        }
        int top = Head.data;
        Head = Head.next;
        return top;
     }
     public static int peek(){
        int top = Head.data;
        return top;
     }
    }

    }
    public static void main(String[] args) {
     Stack s = new Stack();
 s.push(1);
 System.out.println(s.pop());
 s.pop();
    } 

}
