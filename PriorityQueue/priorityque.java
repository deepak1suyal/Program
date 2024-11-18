import java.util.PriorityQueue;

public class priorityque {
    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>();//min heep

q.add(10);
q.add(20);
q.add(15);
q.add(90);
q.add(40);
q.add(35);
q.add(75);
q.add(80);
q.add(60);
q.add(55);
System.out.println(q);
System.out.println(q.remove());

System.out.println(q);



    }
}
