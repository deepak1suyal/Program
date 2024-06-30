import java.util.ArrayList;
import java.util.List;

public class lagestpermu {
    public static void main(String[] args) {
      String a="313535133";
       int od=0;
      List<Integer> f=new ArrayList<>();
      for(int i=0;i<11;i++){
       f.add(0);
      } 
      int n=a.length();
      for(int i=0;i<n;i++){
      int u=Integer.parseInt(a.charAt(i)+"");
     f.set(u, f.get(u)+1);

      }
     int iod=0;
     String w="";
System.out.println(f);
for(int i=0;i<f.size();i++){
    if(f.get(i)%2!=0)
   { od++;
    iod=i;
}}
if(od>1){
    System.out.println("not palandrom");

}
else{
    if(f.get(iod)%2!=0 && iod!=0)
{
    w=iod+"";
    f.set(iod,f.get(iod)-1);

}
for(int i=0;i<f.size();i++){
  if(f.get(i)==0)
  continue;
  else{
for(int t=0;t<f.get(i)/2;t++){
    w=i+w+i;
}

  }

    
}


}
System.out.println(w);

    }
    
}
