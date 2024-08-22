package Thread;
class app4 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        for (int i=0;i<50;i++){
        System.out.println("App2");
        
    }
    }

}

class app3 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        for (int i=0;i<50;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        System.out.println("App1 "+i);
       
      //  Thread.yield();//It will give chanse to next Thread (App2)
    }
    }

}
public class sleep {
    public static void main(String[] args) {
        Thread a=new Thread(new app3());
        a.start();
        Thread a1=new Thread(new app4());
        a1.start();
    }
}
