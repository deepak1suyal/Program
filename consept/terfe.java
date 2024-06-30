/**
 * interfae
 */
 interface Ap {
//final int a=10;
 void fn();   
}
class Bu implements Ap{
    int aw=0;
    void t(){
       System.out.println(aw); 
    }
    @Override
   public void fn(){
    aw=10;
       
    }
}

class terfe{
    
    public static void main(String[] args) {
        Bu b = new Bu();
       b.t();
        b.fn(); 
         b.t();
    }
}