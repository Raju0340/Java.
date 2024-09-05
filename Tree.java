public class Tree {
    static class Node{
        int value;
        Node right;
        Node left;
        Node(int value){
        this.value = value;
        }
    
    }
       public static void main(String[] args) {

       Node root = new Node(1);
       root.left = new Node(2);
       root.right=new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
   // preorder(root);
//postOrder(root);
inOrder(root);
    }

    public static void preorder(Node root){
        if(root == null)
        return;
        System.out.print(root.value+ " ");
       preorder(root.left);

       preorder(root.right);
    }

    public static void inOrder(Node root ){
        if(root == null ){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root ){
        if(root == null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value+" ");
    }
    
}
