package Thread;
class app2 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        for (int i=0;i<50;i++){
        System.out.println("App2");
        
    }
    }

}

class app1 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        for (int i=0;i<50;i++){
           
        System.out.println("App1");
        Thread.yield();
    }
    }

}
public class yeld  {
    public static void main(String[] args) {
        
        Thread a=new Thread(new app1());
        a.start();
        Thread a1=new Thread(new app2());
        a1.start();
        
    }
}
