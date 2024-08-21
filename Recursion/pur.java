package Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class pur {

    public static void swap(int a[],int k,int i){
        int s=a[k];
        a[k]=a[i];
        a[i]=s;
    }
    static int c=0;

    public  static void fn(int a[],int l,int i,ArrayList<Integer> ar, ArrayList<ArrayList<Integer>> r,Set<ArrayList<Integer>> hs){
if(i==l)
{ArrayList<Integer> d=new  ArrayList<>();
   for(int t=0;t<a.length;t++)
   d.add(a[t]);
   c++;
   if(!hs.contains(d)){
    hs.add(new ArrayList(d));
    r.add(new ArrayList(d));
  
return ;
    
}}

    for(int k=i;k<=a.length-1;k++){
     //   if(a[k]==a[i]&&i!=k)
      //  continue;
     swap(a,k,i);
   //  ar.add(a[k]);
     fn(a, l, i+1, ar,r,hs);
    // ar.remove(Integer.valueOf(a[k]));
     swap(a,k,i);
    }
     
    }

    public static void fno(ArrayList<Integer> arr,boolean[] v,Set<ArrayList<Integer>> hs, ArrayList<ArrayList<Integer>> r,ArrayList<Integer> ar){
          if(ar.size()==arr.size()){
              if(!hs.contains(ar)){
                  hs.add(new ArrayList(ar));
                  r.add(new ArrayList(ar));
              }
              return ;
          }
          for(int i=0;i<arr.size();i++){
              if(v[i]==true){
                  continue;
                 }
              v[i]=true;
              ar.add(arr.get(i));
              fno(arr,v,hs,r,ar);
              v[i]=false;
              ar.remove(ar.size()-1);
                     }
      }
    public static void main(String[] args) {
        int a[]={1,2,3};
        ArrayList<ArrayList<Integer>> r=new ArrayList<>();
        ArrayList<Integer> ar=new ArrayList<>();
         // Collections.sort(arr);
        boolean[] visit=new boolean[9];
        Set<ArrayList<Integer>> hs=new HashSet<>();      
     //  fno(arr,9,0,ar,r,hs);
       // fno(arr,visit,hs,r,ar);
        fn(a,a.length,0,ar,r,hs);
        System.out.println(r);
        System.out.println(c);
    }
    
}
