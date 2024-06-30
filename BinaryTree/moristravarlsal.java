
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
public class moristravarlsal {

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
/**
 * @param n
 */
public static void moristravarlsa(TreeNode n){
    TreeNode c=null;
while(n!=null){
if(n.left==null){
    System.out.print(n.val+" ");
   n= n.right;
   
    
}else{
c=n.left;
while(c.right!=null&&c.right!=n){
    c=c.right;
}
if(c.right==null)
{
    c.right=n;
    n=n.left;
}
else if(c.right==n){
    System.out.print(n.val+" ");
    c.right=null;
    n=n.right;
}

}

}
}
public static void in(TreeNode p){
    if(p==null)
    return;
  
    in(p.left);
      System.out.print(p.val+" ");
     in(p.right);

}

    public static void main(String args[]){
        int[] preorder={27,34,58,50,44};
        TreeNode t=new TreeNode(preorder[0]);
        for (int i=1;i<preorder.length;i++){
            fn(preorder[i],t);
        }
        in(t);
        System.out.println("");
        moristravarlsa(t);
    }
}
