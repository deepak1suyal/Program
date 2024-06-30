import java.util.*;
public class fibronachi {
    public static int fib(int a,int as[]){
        if(a<=0)
        return 0;
        else if(a<=1) 
        return 1;
if(as[a]!=-1)
return as[a];
return as[a]=fib(a-1,as)+fib(a-2,as);
    }
    public static void main(String[] args) {
        int as[]=new int[101];
        Arrays.fill(as,-1);
    System.out.println(fib(100,as));
}
    
}
