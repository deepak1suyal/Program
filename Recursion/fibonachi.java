package Recursion;



public class fibonachi {
static int fibonach(int n){
 if(n<=1)
 return n;
    return fibonach(n-1)+fibonach(n-2);
} 

    public static void main(String[] args) {
       System.out.println(fibonach(6));
    }
}
