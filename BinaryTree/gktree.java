
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}


class Solution
{ static int l=-1;
static int w=1;
    void level(Node r,int ce) {
       if(r==null){
         return;  
       }
       if(w==0)
       return;
       if(r.left==null&&r.right==null){
           if(l==-1){l=ce;
               return;
           }
           else {if(l!=ce){
               w=0;
               return ;}
           }
           return;
       }
       
  
    level(r.left,ce+1) ;
    
  level(r.right,ce+1);
     
     
    }
    
    boolean check(Node root)
    {
      level(root,0);
      if(w==1)
       return true;
       else  return false;
	// Your code here	
    }
}



public class gktree {
    public static void main(String[] args) {
        Node n=new Node(7);
        Solution s=new Solution();
       System.out.println(s.check(n));
    }
}
