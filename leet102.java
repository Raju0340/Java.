package basic;
import java.util.*;
public class leet102 {
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
               this.right = right;
         }
  public List<List<Integer>> levelOrder(TreeNode root) { 
        List<List<Integer>> result = new arrayList<>();
        if(root==null)
        return null;
        Queue <TreeNode> queue = new LinkedList<>();
       queue.add(root);
        while(!queue.isEmpty()){
        int levelsize = queue.size(); 
        List<Integer> arr = new arrayList<>(levelsize);
        
       
        for(int i=0;i<levelsize;i++){
         TreeNode currentnode = queue.poll();
         arr.add(currentnode.val);
           if(currentnode.left!=null){
            queue.add(root.left);
           }
           if(currentnode.right!=null){
            queue.add(root.right);
           }
        }
        result.add(arr);
    }
        return result;
    }
}
public static void main(String[] args) {
    //TreeNode node = new TreeNode();//
}
}
