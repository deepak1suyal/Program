package comparable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class apple implements Comparable<apple> {
    int size;
    apple(int size){
        this.size=size;
    }
    public String toString(){
        return ""+size;
    }
    @Override
    public int compareTo(apple o) {
        // TODO Auto-generated method stub
        return this.size-o.size;
    }
    apple(){}
    
}

public class applecom {
    public static void main(String[] args) {
        ArrayList<apple> a=new ArrayList<>();
        a.add(new apple(50));
        a.add(new apple(40));
        a.add(new apple(90));
        a.add(new apple(10));
        System.out.println(a);
     Collections.sort(a);
     System.out.println(a);
 /* apple arr[]=new apple[5];
    arr[0]=new apple(50);
    arr[1]=new apple(40);
    arr[2]=new apple(90);
    arr[3]=new apple(10);
    arr[4]=new apple(20);
    for (apple apple : arr) {
        System.out.println(apple);
    }
Arrays.sort(arr);
for (apple apple : arr) {
    System.out.println(apple);
} */  


    }
}
