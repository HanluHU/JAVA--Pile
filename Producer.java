import java.util.Random;

public class Producer extends Thread{
	
	private Pile ThreadPile;
	
	public Producer(Pile PIL) {
		ThreadPile=PIL;
	}
	
	public void run() {
	    try {
	    	while(true) {
	    		Random random = new Random();
	    		ThreadPile.PILPush(random.nextInt(1000));
	            Thread.sleep(20000);
	        }
	    }catch (Exception exc) {}
	}
}
