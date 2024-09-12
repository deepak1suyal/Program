package LamdaExpress;
//LamdaExpression
public class lamada {
    
        public interface Inne {
            public int opration(int a,int b);
            }
    public static void main(String[] args) {

        Inne at=(int a,int b) -> a+b;
       System.out.println(at.opration(56, 0));
       
       } 
    
}

