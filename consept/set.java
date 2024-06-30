import java.util.Timer;
import java.util.TimerTask;

public class set {
    public static void main(String[] args) {
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Code to be executed at the specified interval
                System.out.println("Hello, World!");
            }
        };
        
        // Schedule the task to run every 1 second (1000 milliseconds)
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
