import java.util.HashSet;

public class test {
     public static int smallestSubstring(String S) {
        HashSet <Character> p=new HashSet<>();
        p.add('0');
         p.add('1');
          p.add('2');
        
         int h=0,t=S.length()-1;
         while(S.charAt(h)==S.charAt(h+1)&&h<t){
             h++;
         }
         if(h==t)
         return -1;
         while(S.charAt(t)==S.charAt(t-1)&&h<t){
             t--;
         }
         if(h==t)
         return -1;
         if(S.charAt(h)==S.charAt(t)){
             t--; }
         if(h+1==t)
         return -1;
         while(S.charAt(t)==S.charAt(t-1)&&h<t){
             t--;
         }
         int l=t;
         while(h+2<=l){
            if(S.charAt(h)!=S.charAt(h+1)&&S.charAt(h)!=S.charAt(h+2)&&S.charAt(h+1)!=S.charAt(h+2))
             if(p.contains(S.charAt(h))&&p.contains(S.charAt(h+1))&&p.contains(S.charAt(h+2))){
                 return 3;
             }
             h++;
         }
         return -1;
        // Code here
    }
    public static void main(String[] args) {
        System.out.println(smallestSubstring("12121"));
    }
}
