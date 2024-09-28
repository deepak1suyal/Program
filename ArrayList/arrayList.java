package ArrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(9);
        for(int i=0;i<=10;i++)
        a.add(i);
        System.out.println(a.size());
        System.out.println(a.isEmpty());
    }
}
