package GeeksforGeeks;

public class searchcycle {
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        s2=s2+s2;
        int s=0;
        int k=0;
        for(int i=0;i<s1.length();i++){
            s+=s1.charAt(i)-'a';
        }
        int p=0;
        for(int i=0;i<s2.length();i++){
            if(i<s1.length()){
                k+=s2.charAt(i)-'a';
                if(k==s){
                if(s1.equals(s2.substring(p,i+1)))
                return true;
                }
            }
            k-=s2.charAt(p)-'a';
            p++;
            k+=s2.charAt(i)-'a';
            if(k==s)
            if(s1.equals(s2.substring(p,i+1)))
            return true;
            
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(areRotations("abcd", "cdab"));
    }
}
