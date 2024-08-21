package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

class apple implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
       Integer data1=(Integer) o1;
      Integer data2=(Integer) o2;
        if(data1>data2) return -2;//reverce-oder
        else if(data1<data2) return 1;
        else return 0;
        /*   if(data1>data2) return 1;//acending-oder
        else if(data1<data2) return -1;
        else return 0; */
    }
}
public class compare {
    public static void main(String[] args) {
        TreeSet<Integer> treeset=new TreeSet<>(new apple());
        treeset.add(10);
        treeset.add(50);
        treeset.add(30);
        treeset.add(1);
        System.out.println(treeset);
    }
}
