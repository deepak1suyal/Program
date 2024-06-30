import java.util.*;
class node{
    int d;
    ArrayList <node> child;
    node(int val){
        d=val;
        child=new ArrayList<>();
        
    }
}

 class genrictree {
    

    static void pre(node r){
      if(r.child.isEmpty()){
System.out.print(r.d+" ");
  return;
      }
      System.out.print(r.d+" ");
   int n=r.child.size();
   for(int i=0;i<n;i++) 
     pre(r.child.get(i));
    }
    static void post(node r){

 if(r.child.isEmpty()){
System.out.print(r.d+" ");
  return;
      }

   int n=r.child.size();
   for(int i=0;i<n;i++) 
     post(r.child.get(i));
      System.out.print(r.d+" ");


    }
    static void level(node r)
    {System.out.print(r.d+" ");
      Queue <node> q=new LinkedList<>();
      int n=r.child.size();
      for(int i=0;i<n;i++)
      q.add(r.child.get(i));
      while(!q.isEmpty()){
        node t=q.peek();
        System.out.print(t.d+" ");
        int o=t.child.size();
      for(int i=0;i<o;i++)
      q.add(t.child.get(i));
     q.remove();

      }
      



    }
    public static void main(String[] args) {
        node root =new node(30);
        root.child.add(new node(5));
          root.child.add(new node(11));
            root.child.add(new node(63));
            root.child.get(0).child.add(new node(1));
             root.child.get(0).child.add(new node(4));
             root.child.get(0).child.add(new node(8));
             root.child.get(1).child.add(new node(6));
             root.child.get(1).child.add(new node(7));
             root.child.get(1).child.add(new node(15));
             root.child.get(2).child.add(new node(31));
             root.child.get(2).child.add(new node(55));
             root.child.get(2).child.add(new node(65));
            pre(root);
            System.out.println(" ");
   post(root);
    System.out.println(" ");
   level(root);
   
   
   
        }
}
