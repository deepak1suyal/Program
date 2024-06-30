import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.script.Compilable;

/**
 * greedemaximum
 */
public class greedemaximum {
public static class meet{
    int s;
    int f;
    int n;
    public String toString(){
        return s+" "+f;
    }
}
public static class meeting implements Comparator<meet>{
    public int compare(meet m1,meet m2){
     
if(m1.f>m2.f)
return 1;
else if(m1.f<m2.f)
return -1;
else return 0;


    }

}
    public static void main(String[] args) {
        List<Integer> s=List.of(1,3,0,5,8,5);
        List<Integer> f=List.of(2,4,6,7,9,9);
        List<meet> m=new ArrayList<>();
       for(int i=0;i<s.size();i++){
        meet mo=new meet(); 
        mo.s=s.get(i);
        mo.f=f.get(i);
        mo.n=i+1;
        m.add(mo);}
m.sort(new meeting());
System.out.println(m);

 List<Integer> re=new ArrayList<>();
 re.add(m.get(0).n);
 meet p=m.get(0);
for(int i=1;i<m.size();i++){
meet c=m.get(i);
if(c.s>p.f){
re.add(c.n);
p=c;}


}
System.out.println(re);
        
       }

    }
