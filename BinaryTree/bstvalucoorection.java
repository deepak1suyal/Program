/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
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
    static TreeNode a,l,c;
    static int z=0;

public static void fo(TreeNode c,TreeNode l){
     int t=c.val;
            c.val=l.val;
            l.val=t;
}

    public static void fn(TreeNode root){
        if(root==null)
        return;
        fn(root.left);
if(a!=null){
    if(a.val>root.val){
        
        if(z==1){
            int t=c.val;
            c.val=root .val;
            root.val=t;
            z=2;
        }
        if(z==0){
        c=a;
        l=root;
        a=root;
        z++;}
    }
    else{
        a=root;
    }         

}else{
        a=root;
    }
        fn(root.right);

    }

    public static void recoverTree(TreeNode root) {
 fn( root);
 if(z==1){
     fo(c,l);
       
 }}

 public static void opr(TreeNode e){
    if(e==null)
    return;
    opr(e.left);
    System.out.print(e.val);
    opr(e.right);
 }
        
    
    public static void main(String[] args) {
        TreeNode t=new TreeNode(3);

         TreeNode y=new TreeNode(1);
          TreeNode u=new TreeNode(4);
           TreeNode i=new TreeNode(2);
            t.left=y;
            t.right=u;
            u.left=i;
            opr(t);
          //  recoverTree(t);
          //  opr(t);
        
    }
}