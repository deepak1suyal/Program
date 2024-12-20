package Thread;


class app6 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        for (int i=0;i<50;i++){
        System.out.println("App2");
        
    }
    }

}

class app5 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        for (int i=0;i<50;i++){
           
        System.out.println("App1");
        
    }
    }

}
public class join {
   static public void main(String[] args) throws InterruptedException {
        Thread a=new Thread(new app5());
        a.start();
        a.join();
        Thread a1=new Thread(new app6());
        a1.start(); 
        a1.join();//It will ensure that the task will end of the thread
     System.out.println("Hi");
    }
}
