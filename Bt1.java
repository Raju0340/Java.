public class Bt1 {
 static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
 }
 static int nodes(Node root){
   if(root == null){
      return 0;
   }
   int leftNodes = nodes(root.left);
   int rightNodes = nodes(root.right);
   return leftNodes + rightNodes+1;
 }
 static int sumNodes(Node root){
   if(root == null){
      return 0;
   }
   int leftsum = sumNodes(root.left);
   int rightsum = sumNodes(root.right);
   return leftsum + rightsum + root.data;
 }
 static int height(Node root){
   if(root == null){
      return 0;
   }
   int leftHeight = height(root.left);
   int rightHeight = height(root.right);
   return Math.max(leftHeight, rightHeight)+1;
 }
 static int diameter(Node root){
   if(root == null){
      return 0;
   }
   int leftdiameter = diameter(root.left);
   int lh = height(root.left);
   int rightdiameter = diameter(root.right);
   int rh = height(root.right);
   int selfdiameter = lh+rh+1;
   return Math.max(selfdiameter,Math.max(rightdiameter, leftdiameter));
 }
 static void inorder(Node root){
    if(root == null){
        return;
    }
    inorder(root.left);
    System.out.println(root.data);;
    inorder(root.right);

 }
 public static void main(String[] args){
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
   
 }
}
