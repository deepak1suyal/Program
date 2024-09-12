package Recursion;
//printing name N times using recursion
public class printName {
    static void fn(int n,int v){
    if(n==v)
    return;
    System.out.println("Deepak");
    fn(++n, v);
    }
    public static void main(String[] args) {
        fn(1,10);
    }
}
