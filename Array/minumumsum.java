package Array;

import java.util.ArrayList;
import java.util.Arrays;

class MinS {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        int l=0;
        int r=0;
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
          
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(a.size()==0&&arr[i]==0)
                continue;
                
                a.add(arr[i]);
            }
            else{if(b.size()==0&&arr[i]==0)
                continue;
                b.add(arr[i]);
                
            }
        }
        StringBuilder s=new StringBuilder();
        int carry=0;
        int j=a.size()-1;
        int i=b.size()-1;
        while(j>-1&&i>-1){
            int an=a.get(j)+b.get(i)+carry;
            s.append(an%10);
            carry=an/10;
            j--;
            i--;
        }
        if(j==-1)
        {
               while(i>-1){
            int an=b.get(i);
            s.append(an%10+carry);
            carry=an/10;
           
            i--;
        }
        }
        else{     while(j>-1){
            int an=a.get(j);
            s.append(an%10+carry);
            carry=an/10;
           
            j--;
        }}
        s.reverse();
        return s.toString();
        
    }
}
public class minumumsum {
    public static void main(String[] args) {
        int arr[]={6,8,4,5,2,3};
        MinS s=new MinS();
       System.out.println(s.minSum(arr)); 
    }
}
