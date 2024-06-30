import java.util.*;
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
  }

class bst{
    /**
     * @param l
     */
    public static void preoder(TreeNode l){
if(l==null)
return;

        System.out.println(l.val);
        preoder(l.left);
         preoder(l.right);

        



    }
     public static TreeNode fn(int a[],int l,int h){
     if(l>h){
   return null;  }
     
     int m=l + ((h - l) / 2);
     TreeNode t=new TreeNode(a[m]);
     t.left=fn(a,l,m-1);
     t.right=fn(a,m+1,h);
return t;}
    public static void main(String[] args) {
        int a[]={-10,-3,0,5,9};
preoder(fn(a,0,5-1))
;
    }
}