package Heap;
import java.util.ArrayList;

public class heaptree {

static void maxinsertion(ArrayList<Integer> a,int v){
     a.add(v);
     int o=a.size()-1;
     while(a.get(o)>a.get((o-1)/2)){
        int y=a.get(o);
a.set(o,a.get((o-1)/2));
a.set((o-1)/2,y);
o=(o-1)/2;

     }
    }

    static void mininsertion(ArrayList<Integer> a,int v){
     a.add(v);
     int o=a.size()-1;
     while(a.get(o)<a.get((o-1)/2)){
        int y=a.get(o);
a.set(o,a.get((o-1)/2));
a.set((o-1)/2,y);
o=(o-1)/2;

     }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(10);
              a.add(20);
                    a.add(30);
                          a.add(40);
                                a.add(50);
         System.out.println("minheep");
          System.out.println(a);
         mininsertion(a,7);

        System.out.println(a);
         ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(60);
              b.add(50);
                    b.add(40);
                          b.add(30);
                                b.add(20);
                                 b.add(30);
                       
          b.add(10);
          System.out.println("maxheep");
          System.out.println(b);
        maxinsertion(b,40);
        System.out.println(b);
    }
}
