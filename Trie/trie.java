package Trie;

class node {
    boolean endword;
    node[] child;
    public node() {
        endword = false;
        child = new node[26];
        for(int i=0;i<26;i++)
        child[i]=null;
    }    
    }
public class trie {
    static  node head=new node();
    static node ch=head;
//Inserting element
    public void insertTrie(String words){
        node start=head;
      
          
            for(int i=0;i<words.length();i++){
                int index=words.charAt(i)-'a';
                if(head.child[index]==null)
                head.child[index]=new node();
                if(i==words.length()-1)
                head.child[index].endword=true;
                head=head.child[index];
                
            }
        }
    
//Search Time Complexcity O(L)
public  boolean searchword(String word){
    node start=ch;
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

}
