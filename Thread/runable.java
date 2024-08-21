package Thread;

import java.io.IOException;
import java.nio.CharBuffer;

class inter implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i=0;i<50;i++)
        System.out.println("Runable");
    }

 
}
class app implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i=0;i<50;i++)
        System.out.println("App");
    }

}

public class runable {

  public static void main(String[] args) {
    Thread t=new Thread(new inter());
    t.start();
    Thread a=new Thread(new app());
    a.start();
    for (int i=0;i<50;i++)
    System.out.println("Main");
  }
  static {
    for (int i=0;i<50;i++)//It will execute whole block
    System.out.println(i+"Static");
}
}
