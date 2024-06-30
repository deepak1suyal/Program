

/**
 * Innerte
 */
 interface I {
 void fn();
    
}

class ao implements I{
    int a=3;
   public void fn(){
        System.out.println("op");
    }
}

public class te {
    public static void main(String[] args) {
        ao se=new ao();
        
       se.fn();
    }
}
