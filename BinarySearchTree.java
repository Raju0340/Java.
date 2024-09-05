package datastructures;

public class BinarySearchTree {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,5}; 
        Node root = null;
       for(int i =0;i<arr.length;i++){
        insert(root,arr[i]);
       }
    display(root);

    }
    
    public static void display(Node root){
        while(root!=null){
            System.out.println(root.data);
        
        }//display(root.left);
       // display(root.right);
      
    }
    public static Node  insert(Node root , int value){
       
        if(root == null){
           root =new Node(value);
        }
        else if(root.data<value){
            insert(root.right,value);
    
        }
        else{
            insert(root.left,value);
        }
        return root;
    }


    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
        }
    }
}
