package ArrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(9);
        for(int i=0;i<=10;i++)
        a.add(i+1);
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println(a.remove(10));//index
        a.add(2,65);
        System.out.println(a.get(2));
    }
}
