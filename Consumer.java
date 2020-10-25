
public class Consumer extends Thread{
	
	private Pile ThreadPile;
	
	public Consumer(Pile PIL) {
		ThreadPile=PIL;
	}
	
	public void run() {
	    try {
	    	while(true) {
	    		ThreadPile.PILPop();
	            Thread.sleep(30000);
	        }
	    }catch (Exception exc) {}
	}
}

