package BitManupilation;

public class swap2number {
    public static void main(String[] args) {
        int a,b;
        a=-5;
        b=9;
        System.out.println("Before swapping: a = "+a+" b = "+b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swapping: a = "+a+" b = "+b);
    }
}
