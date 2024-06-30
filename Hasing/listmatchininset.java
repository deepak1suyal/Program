package Hasing;

import java.util.ArrayList;
import java.util.HashSet;

public class listmatchininset {

    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        HashSet<Integer> s=new HashSet<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<m;i++){
            int num=0;
             for(int j=0;j<n;j++){
          num+=matrix[i][j]<<j;
             }
             if(s.contains(num))
             a.add(i);
             else{
                 s.add(num);
             }
        }
        return a;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ae=new ArrayList<>();
        HashSet<ArrayList<Integer>> s=new HashSet<>();
        int arr[][]={{1,0,1},{1,1,1}};
        for(int i=0;i<2;i++){
            ae=new ArrayList<>();
            for(int j=0;j<3;j++){
ae.add(arr[i][j]);
            }
      if(s.contains(ae)){
        System.out.println(ae);
      }
      else{s.add(ae);}
        }    
    }
    
}
