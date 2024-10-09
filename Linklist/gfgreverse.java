package Linklist;

public class gfgreverse {
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    } 
    class Solution {
        // Function to reverse a circular linked list
    
        Node reverse(Node head) {
              Node p=null;
            Node l=head;
                 Node cur=head;
           
            p=head;
            head=head.next;
            while(head!=cur){
               p=head;
               head=head.next;
            }
            
            
            
            // code here
            head=l;
            p.next=null;
            Node n=new Node(head.data);
            head=head.next;
            while(head!=p){
              
                   
              
                  Node k=new Node(head.data);
                  k.next=n;
                  n=k;
                  head=head.next;
                
            }
             p.next=n;
                    
             return p;
        }
    
        // Function to delete a node from the circular linked list
        Node deleteNode(Node head, int key) {
            // code here
             Node p=null;
            Node cur=head;
            
            p=head;
            head=head.next;
            while(head!=cur){
                   
               if(head.data==key) 
               {
                   p.next=head.next;
                   return cur;
               }
             
               p=head;
               head=head.next;
            }
           return cur; 
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
