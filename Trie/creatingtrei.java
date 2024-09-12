package Trie;
/**
 * Innercreatingtrei
 */
 class nodeT {
boolean endword;
nodeT[] child;
public nodeT() {
    endword = false;
    child = new nodeT[26];
    for(int i=0;i<26;i++)
    child[i]=null;
}    
}

public class creatingtrei {
    static  nodeT head=new nodeT();
    static nodeT ch=head;
//Inserting element
    public static void insertTrie(String words[]){
        nodeT start=head;
        for(int k=0;k<words.length;k++){
            head=start;
          String  words2=words[k];
            for(int i=0;i<words2.length();i++){
                int index=words2.charAt(i)-'a';
                if(head.child[index]==null)
                head.child[index]=new nodeT();
                if(i==words2.length()-1)
                head.child[index].endword=true;
                head=head.child[index];
                
            }
        }
    }
//Search
public static boolean searchword(String word){
    nodeT start=ch;
    for(int i=0;i<word.length();i++){
        if(start.child[word.charAt(i)-'a']!=null){
            if(i==word.length()-1&&start.child[word.charAt(i)-'a'].endword==true)
            return true;
            start=start.child[word.charAt(i)-'a'];
        }
        else{
            break;
        }
    }
    return false;
}
//main function
    public static void main(String[] args) {
    
        String words[]={"the","a","their","but"};
        //Inserting words in Trie
        insertTrie(words);
      
       System.out.println(searchword("their"));
   
    }
}
