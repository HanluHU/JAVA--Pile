
public abstract class Alert1 implements Alert, Subscriber{
	protected int ALTSize;
	
	public void SUBUpdate(Pile PIL) {
		ALTSize=PIL.PILGetSize();
		Alert();
	}
	
	public abstract void Alert();
}
