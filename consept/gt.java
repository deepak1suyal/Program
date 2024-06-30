import java.util.ArrayList;

public class gt {

     static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {int h=0,l=0;
    int S=0;
     ArrayList<Integer> a=new   ArrayList<>();
        while(h<n){
             if(S==s){
              
               a.add((l+1));
               a.add((h+1));
               return a;
           }
         else if(arr[h]+S<=s){
              S=arr[h]+S;
              h++;
          }  
           else if(arr[h]+S>s) {
             
              S=S-arr[l];
               l++;
           }
          
        }
        a.add(-1);
       return a;
        // Your code here
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,7,5};
        System.out.println(subarraySum( ar,5,12));
    }
}
