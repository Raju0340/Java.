package datastructures;

public class BT{


public static class Node{
    int value;
    Node right;
    Node left;
    Node(int value){
    this.value = value;
    }

}

public static void main(String[] args) {

    
    Node root = new Node(1);
    root.left=new Node(2);
    root.right = new Node(3);
    root.left.left= new Node(4);
    root.left.right= new Node(5);
    root.right.left= new Node(6);
    root.right.right= new Node(7);


    preorder(root);
    System.out.println();
    inorder(root);
    System.out.println();
    postorder(root);
}



private static void postorder(Node root) {
   if(root==null)return;
   postorder(root.left);
   postorder(root.right);
   System.out.print(root.value+" ");
}



public static void preorder(Node root){
    if(root == null)
    return;
    System.out.print(root.value+" ");
   preorder(root.left);

   preorder(root.right);
}
public static void inorder(Node root){
if(root == null) return;
inorder(root.left);
System.out.print(root.value+" ");
inorder(root.right);
}


}
