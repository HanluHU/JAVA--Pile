
public class Alert1AlmostFull extends Alert1{
	public void Alert() {
		if(ALTSize>7&&ALTSize!=10)
			System.out.println("ALERT: Pile is almost full.");
	}
}
