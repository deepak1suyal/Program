package Hasing;

import java.util.HashMap;
import java.util.HashSet;

  class ge{
    int g=0;
    int k=0;
    int sum=0;
 }
public class hasmap {
    /**
     * @param args
     */
  
    public static void main(String[] args) {
       
        int arr[]={1,2,1,2,3,4,3,4};
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(set.containsKey(arr[i])){
                int a=set.get(arr[i]);
                a+=arr[i];  
                set.put(arr[i],a);
            }
            else {
                set.put(arr[i],arr[i]);
            }

        }
        ge l=new ge(); 
       int i=0;
       
        while (!set.isEmpty()) {
            
               set.forEach((Key,Value)->{
          if(l.g<Value){
                    l.g=Value;
                   
                    l.k=Key;
                      }
                    }
 );    
  set.remove(l.k);
 if(i%3==0)
             l.sum+=l.g;
             l.g=0;
i++;


    
        }
        System.out.println(l.sum);
    }
}
