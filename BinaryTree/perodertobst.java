 

  
public class perodertobst {
   static int i=0;
  static class bst{
    int v;
    bst l;
    bst r;
   public  bst(int value){
       this.v=value;
    }
}
   static bst fn(int a[],int m){
if(i==a.length||a[i]>m)
return null;
int r=a[i];
i++;
bst b=new bst(r);
b.l=fn(a,b.v);
b.r=fn(a,m);
return b;

   }
   static void pre(bst b){
    if(b==null)
    return;
    System.out.print(b.v);
    pre(b.l);
    pre(b.r);
   }
    public static void main(String[] args) {
        int p[]={8,5,1,7,10,12};
       bst u= fn(p,Integer.MAX_VALUE);
       pre(u);
       
    }
    
}
