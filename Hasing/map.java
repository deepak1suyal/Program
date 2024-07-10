package Hasing;
import java.util.*;
public class map {
    public static void main(String[] args) {
       HashMap<String,Integer> p=new HashMap<>();
       p.put("deepak",32 ) ;
       p.put("amrit",321) ;
       p.put("manish",327) ;
       p.put("tarun",324 ) ;
       System.out.println(p.containsKey("deepak"));
       System.out.println(p);
       for(Map.Entry<String,Integer> set:p.entrySet()){
       System.out.print(set.getKey()+" = "); 
       System.out.print(set.getValue());  
       System.out.println(""); 
   }
       p.forEach((Key,Value)->
 
 System.out.println(Key+" "+Value));
  System.out.println(p.get("deepak"));
    }
   
}
