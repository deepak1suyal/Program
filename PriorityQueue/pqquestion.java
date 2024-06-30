import java.util.PriorityQueue;

public class pqquestion {
    public static void main(String[] args) {
        int a[]={3,7,2,9,5};
        int k=3;
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
       if( i<k)
       q.add(a[i]);
else{
    if(q.peek()<a[i])
     {q.remove();
         q.add(a[i]);}
}


        }
  System.out.println(q.peek());  }
    
}
