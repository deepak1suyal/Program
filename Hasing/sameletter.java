package Hasing;

import java.util.HashMap;

public class sameletter {
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
      
        if(s1.length()!=s2.length())
        return false;
        int k=0;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(h.containsKey(s1.charAt(i)))
            {
                k=h.get(s1.charAt(i));
                k=k+1;
                h.put(s1.charAt(i),k);
                
            }
            
            h.put(s1.charAt(i),1);
        }
         for(int i=0;i<s2.length();i++){
             if(!h.containsKey(s2.charAt(i)))
             return false;
             else{
           if(h.get(s2.charAt(i))==0)
           return false;
           k=h.get(s2.charAt(i));
           k=k-1;
            h.put(s2.charAt(i),k);
           
        }}
      
        return true;
       
    }
    public static void main(String[] args) {
        System.out.println(areAnagrams("geeks", "kseeg"));
    }
}
