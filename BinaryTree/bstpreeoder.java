import java.util.*;
 class TreeNode {
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
 }
class Solution {
    public static void fn(int val,TreeNode t){
        if(t.val>val && t.left!=null)
        {
         fn(val,t.left);
        }
        else if(t.val>val && t.left==null){
            TreeNode p=new TreeNode(val);
            t.left=p;
            return;
        }
        else if(t.val<val && t.right!=null)
        {
         fn(val,t.right);
        }
        else if(t.val<val && t.right==null){
            TreeNode p=new TreeNode(val);
            t.right=p;
            return;
        }
        
    }
     static int a=0;
   static int b=Integer.MAX_VALUE;
  static TreeNode c=null;
  
    
    public static void fno(TreeNode root){
    
     if(root==null)
     return ;
     fno(root.left);
     if(c!=null){    
       
       a=Math.abs(root.val-c.val);
b=Math.min(b,a);}
 c=root;   
     fno(root.right);

    }
    public static void main(String[] args) {
        int[] preorder={27,34,58,50,44};
TreeNode t=new TreeNode(preorder[0]);
for (int i=1;i<preorder.length;i++){
    fn(preorder[i],t);
}
fno(t);
System.out.println(b);
        
    }
}