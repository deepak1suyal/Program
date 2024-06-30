package Stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
    
     
    // System.out.println(s.peek());
    Solution s=new Solution();
     System.out.println(s.removeKdigits("149811",3));
    }
   

}
class Solution {
    public String removeKdigits(String s, int K) {
        // code here
       
        Stack<Character> S=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(S.isEmpty()){
                S.push(s.charAt(i));
                i++;
            }
          else{
              if(S.peek()<=s.charAt(i)){
                  S.push(s.charAt(i));
                  i++;
              }
              else{
              while(!S.isEmpty()&& S.peek()>s.charAt(i)&&K!=0){
                  S.pop();
                  K--;
                 }
              S.push(s.charAt(i));
              i++; }
              
             
              
          }
            
        }
       while(K>0){
           S.pop();
           K--;
       }
       String ans="";
       System.out.println(S.size());
        for( i=0;i<S.size();i++){
            System.out.println(S.peek());
            ans=S.pop()+ans;
        }
        return ans; }
        
    }
