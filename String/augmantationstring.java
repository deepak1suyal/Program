package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

 class ARGST {

    

 String hfn(String s){
    char c[]=new char[s.length()];
    for(int i=0;i<s.length();i++){
        c[i]=s.charAt(i);
    }
    Arrays.sort(c);
    StringBuilder k=new StringBuilder();
      for(int i=0;i<s.length();i++){
        k.append(c[i]);
    }
    return k.toString();
}
public ArrayList<ArrayList<String>> anagrams(String[] arr) {
    // code here
    HashMap<String,ArrayList<String>> h=new HashMap<>();
           for(int i=0;i<arr.length;i++){
       String u=hfn(arr[i]);
       if(h.containsKey(u)){
           ArrayList<String> o=h.get(u);
           o.add(arr[i]);
           
       }
       else{
           ArrayList<String> p=new ArrayList<>();
           p.add(arr[i]);
           h.put(u,p);
       }
    }        
    
      ArrayList<ArrayList<String>> ans=new ArrayList<>();
      h.forEach((key,value)->ans.add(value));
    
    return ans;
    
}
}

public class augmantationstring {
    public static void main(String[] args) {
        String arr[]={"act", "god", "cat", "dog", "tac"};
        ARGST s=new ARGST();
        System.out.println(s.anagrams(arr));
    }
}
