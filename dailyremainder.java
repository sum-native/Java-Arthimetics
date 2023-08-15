import java.util.Timer;
import java.util.TimerTask;

public class DailyRemainder{
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run(){
                System.out.println("It's time to code! 0x1F349");
            }
        };


        // timer.schedule(new TimerTask() {
        //     public void run() {
        //         System.out.println("It's time to code! 0x1F349");
        //     }
        // } );
        timer.schedule(task, 0, 60 * 1000);
    }
}