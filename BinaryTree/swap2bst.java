


class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solut {
    static void  fn1(Node root , int arr[]){   
        if(root==null)
        return;
        fn1(root.left,arr);
        if(arr[2]==root.data){
            root.data=arr[3];
        }
        else if(arr[3]==root.data)
        {
            root.data=arr[2];
        }
        fn1(root.right,arr);
    }
    static void fn(Node root,int arr[])
    {
        if(root==null)
        return;
        fn(root.left,arr);
        if(arr[0]==0){
            if(arr[2]>root.data){
                arr[0]=1;
                arr[3]=root.data;
            }                                                                           
            else{arr[2]=root.data;}
        }
        
        else if(arr[0]==1){
            if(arr[3]<root.data){
                arr[0]=-1;
                
            }else{
             //   arr[3]=root.data;
            }
        }
        
        fn(root.right,arr);
    }
    
    void correctBST(Node root) {
        // code here.
        int arr[]=new int[4];
        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
        arr[3]=0;
        fn(root,arr);
        fn1(root,arr);
    }
}

public class swap2bst {
    
    static void inodertravercel(Node root){
        if(root==null)
        return;
        inodertravercel(root.left);
        System.out.print(root.data+" ");
        inodertravercel(root.right);
    }
    public static void main(String[] args) {
     /* 1
        \
        52
       /   \
      5     62
     / \      \
    4   26     66
   /          /
  2         58
  1 N 52 5 62 4 26 2 66 58
 */   

        Node root = new Node(1);
        root.right = new Node(52);
        root.right.left = new Node(5);
        root.right.right = new Node(62);
        root.right.left.left = new Node(4);
        root.right.left.right = new Node(26);
        root.right.left.left.left = new Node(2);
        root.right.right.right = new Node(66);
        root.right.right.right.left = new Node(58);
        inodertravercel(root);
        System.out.println("");
        Solut s=new Solut();
        s.correctBST(root);
        inodertravercel(root);
    }
}
