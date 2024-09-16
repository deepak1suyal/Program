package Trie;

public class uniquesubstring {
   public static int countusubstring(node r ){
      if(r==null)
      return 0;

      int count=0;
      for(int i=0;i<26;i++){
       if(r.child[i]!=null)
       { 
         count+=countusubstring(r.child[i]);
       }
      }
      return count+1;
   }
   public static void main(String[] args) {

   trie t=new trie();
   String s="ababa";
   for(int i=0;i<s.length();i++){
     String suffix=s.substring(i);
      t.insertTrie(suffix);
      System.out.println(suffix);
   }
   
   System.out.println(countusubstring(t.head)); 
   } 
}
