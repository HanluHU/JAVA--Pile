import java.util.Timer;
import java.util.TimerTask;

public class Warn2 implements Warn{
	
	private int Size;
	private Pile WRNPIL;
	private Timer timer;
	private TimerTask task;
	
	public Warn2(Pile PIL) {
		Size=PIL.PILGetSize();
		WRNPIL=PIL;
		WRNWarn2();
	}
	
	public void WRNWarn2() {
		timer = new Timer();
		task = new TimerTask() {
            public void run() {
            	if(WRNPIL.PILGetSize()>Size+2)
            		System.out.println("WARN : Produced more than 2 numbers in the last 2 seconds.");
            	if(WRNPIL.PILGetSize()<Size-2)
            		System.out.println("WARN : Consumed more than 2 numbers in the last 2 seconds.");
            	Size=WRNPIL.PILGetSize();
            }
        };
        timer.schedule(task, 0, 2000);
	}
	
	protected void finalize() {
		task.cancel();
	}
}
