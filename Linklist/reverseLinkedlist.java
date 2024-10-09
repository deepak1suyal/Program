package Linklist;
 class Node{
    int d;
    Node n;
    Node(int data){
     d=data;
     n=null;
    }
}

public class reverseLinkedlist {






    //
public static int fnc(Node l){
    Node k=l.n;
    while(l.d==k.d){
l=l.n;
k=k.n.n;
    }
    return l.d;
}

    public static Node fn(Node h){
Node cur=h,pr=null,head=h;
while (head!=null&&head.n!=null) {
  Node g=head.n.n;
  cur=h;
  head=head.n;

  head.n=cur;
  cur.n=pr;
pr=head;
head=g;


}
if(head!=null){
    head.n=pr;
    return head;
}
else{
    return pr;
}
    }
    public static void main(String[] args) {
        Node p=new Node(0),head=null;
        for(int i=0;i<11;i++){
            if(i==0)
          {
        head=p;
        }
else
   { p.n=new Node(i);
     p=p.n;
}
        }

        Node main=head;
        for(int i=0;i<10;i++)
       {System.out.println(head.d);
    head= head.n;  }
    head.n=main;
    System.out.println(fnc(main));
    
    }
}
