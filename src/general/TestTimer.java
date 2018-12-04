package general;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
	
    public static void main(String args[]){
        TimerTask timerTask = new MyTimerTask();  
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 2, 1*2000);
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
