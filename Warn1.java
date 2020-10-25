
public class Warn1 implements Warn,Subscriber {
	
	private Pile WRNPIL;
	
	public Warn1(Pile PIL) {
		WRNPIL=PIL;
		PIL.PUBAddSubscriber(this);
	}
	
	public void SUBUpdate(Pile PIL) {
		if(PIL.PILGetSize()>7)
			System.out.println("WARN £º Stock > 7.");
	}
	
	protected void finalize() {
		WRNPIL.PUBRemoveSubscriber(this);
	}
}
