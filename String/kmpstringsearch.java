package String;

import java.io.IOException;
import java.util.ArrayList;

public class kmpstringsearch {
     public static void main(String[] args) throws IOException {
        Solution s=new Solution();
System.out.println(s.search("geeks", "geeksforgeeks"));
    }
   
}
  class Solution
{
    
   public ArrayList<Integer> search(String pat, String txt)
    {int l=pat.length();
    int arr[]=ar(pat);
    int n=txt.length();
    int i=0;
    int j=0;
    
      ArrayList<Integer> a=new ArrayList<Integer>(); 
        // your code here
       while(i<n){
           
           if(pat.charAt(j)==txt.charAt(i)){
               i++;
               j++;
           }
           if(j==l){
               a.add(i-j+1);
               j=arr[j-1];
           }
           else if(i<n&&pat.charAt(j)!=txt.charAt(i)){
               if(j!=0){
                   j=arr[j-1];
               }
               else{i++;}
           }
       }
        return a;
        
    }
   public static int [] ar(String p){
        int n=p.length();
        int arr[]=new int[n];
        int len=0;
        for(int i=1;i<n;){
            if(p.charAt(i)==p.charAt(len)){
                len++;
                arr[i]=len;
                i++;
            }
            else{
                if(len!=0){
                len=arr[len-1];}
                else
                {
                    arr[i]=0;
                    i++;
                }
            }
        }
        return arr;
    }
    
}
  