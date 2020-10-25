
public interface Publisher {
	public void PUBAddSubscriber(Subscriber Sub);
	public void PUBRemoveSubscriber(Subscriber Sub);
	public void PUBNotifyAllSubscribers();
}