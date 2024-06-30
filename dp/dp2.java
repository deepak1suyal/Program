package dp;
public class dp2 {
    public static int fn(String s,int l){
if(l==3)
return 1;
if(l>2)
return 0;
int k=0,p=0;

if(l<2 && s.charAt(l+1)=='0' )
    k=fn(s, l+2);
    else
         k=fn(s, l+1);
if(l<2&&s.charAt(l)>'2')
      p=fn(s, l+1);
     else
         p=fn(s, l+2);
        return k+p;
    }
    public static void main(String[] args) {
        String s="226"; 

System.out.println(fn(s,0));


    }
}
