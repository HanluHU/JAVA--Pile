
public class main {
	
	public static void main(String[] args) {
		 Pile PIL = new Pile("Pile.txt");
		 Stock STK= new Stock();
		 PIL.PUBAddSubscriber(STK);
		 Producer P1= new Producer(PIL);
		 Consumer C1= new Consumer(PIL);
		 P1.start();
		 C1.start();
		 Alert1 ALT1= new Alert1Empty();
		 Alert1 ALT2= new Alert1AlmostEmpty();
		 Alert1 ALT3= new Alert1AlmostFull();
		 Alert1 ALT4= new Alert1Full();
		 PIL.PUBAddSubscriber(ALT1);
		 PIL.PUBAddSubscriber(ALT2);
		 PIL.PUBAddSubscriber(ALT3);
		 PIL.PUBAddSubscriber(ALT4);
		 while(true) {
			 Command CMD = new Command();
			 CMD.CMDReadcommand(PIL);
		 }
    }
}
