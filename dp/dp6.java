package dp;
import java.util.ArrayList;

public class dp6 {



public static boolean plan(String a){
    if(a.length()==1)
    return true;

int l=a.length()-1;
int t=0;
while(t<l){
    if(a.charAt(t)!=a.charAt(l))
    return false;
    t++;
    l--;
}

return true;
}

public static void fn(String a,int i, ArrayList<ArrayList<String>> l,ArrayList<String> o) {
    
if(i==a.length()){
    l.add(new ArrayList<>(o)); 
    return;
}

        for(int p=i;p<a.length();p++){
            if(plan(a.substring(i,p+1))){
           o.add(a.substring(i, p+1));
           fn(a, p+1,l,o);
        o.remove(o.size()-1);    
        }       
      }
    }
    public static void main(String[] args) {
        String a="aab";
        ArrayList<ArrayList<String>> l=new ArrayList<ArrayList<String>>();
        
ArrayList<String> o=new ArrayList<>();
        fn(a,0,l,o);
        for(int i=0;i<l.size();i++)
        System.out.print(l.get(i));
    }
}
