package Thread;
import java.lang.Thread;
class Td extends Thread{
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            
            System.out.println("Child Thread Executing");
        }
    }
}

public class thread {
    public static void main(String[] args) {
        Td t=new Td();
        t.start();

        for(int i=0;i<500;i++)
        {
            System.out.println("Main Thread");
        }
    }
    
}
