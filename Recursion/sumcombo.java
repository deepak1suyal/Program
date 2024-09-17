package Recursion;

import java.util.ArrayList;

public class sumcombo {
    static ArrayList<Integer> a=new ArrayList<>();
    static ArrayList<ArrayList> p=new ArrayList<>();
  static  void fn(ArrayList<Integer> a,int aa[],int i,int sum){
        if(sum==0){
        ArrayList<Integer> k=new ArrayList<>(a);
        p.add(k);
        return;
        }
        else if(i>=aa.length||sum<0)
        return;
        a.add(aa[i]);
        fn(a, aa, i+1, sum-aa[i]);
        a.remove(a.size()-1);
        fn(a, aa, i+1, sum);
    }
    public static void main(String[] args) {
       
        int aa[]={1,2,1};
        fn(a,aa,0,2);
        System.out.println(p);
    }
}
