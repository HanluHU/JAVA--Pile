import java.util.ArrayList;

public class Pile implements Publisher {
	
	private int iPILMaxsize;
	private int[] piPILList; 
	private int iPILTop;
	private int iPILSize;
	private Log PILLOG;
	private ArrayList<Subscriber> PILSubs;
	private Warn PILWarn;
	
	public Pile(String Logname) {
		iPILMaxsize=10;
		piPILList=new int[iPILMaxsize];
		iPILTop=0;
		iPILSize=0;
		PILLOG=new Log(Logname);
		PILSubs=new ArrayList<Subscriber>();
		PILWarn=null;
	}
	public void PUBAddSubscriber(Subscriber Sub) {
		PILSubs.add(Sub);
	}
	public void PUBRemoveSubscriber(Subscriber Sub) {
		if(PILSubs.contains(Sub))
			PILSubs.remove(Sub);
	}
	public void PUBNotifyAllSubscribers() {
		for(int i=0;i<PILSubs.size();i++)
			PILSubs.get(i).SUBUpdate(this);
	}
	
	public int PILGetTop() {
		return iPILTop;
	}
	
	public void PILSetTop(int iTop) {
		iPILTop = iTop;
	}
	
	public int PILGetSize() {
		return iPILSize;
	}
	
	public void PILSetSize(int iSize) {
		iPILSize = iSize;
	}
	
	public int[] PILGetList(){
		return piPILList;
	}
	
	public void PILSetWarn(Warn WRN) {
		if(PILWarn instanceof Warn1)
			((Warn1) PILWarn).finalize();
		if(PILWarn instanceof Warn2)
			((Warn2) PILWarn).finalize();
		PILWarn=WRN;
	}
	
	public void PILPush(int iTop) {
		if(iPILSize==10)
			return ;
		iPILTop=iTop;
		iPILSize=iPILSize+1;
		piPILList[iPILSize-1]=iTop;
		PUBNotifyAllSubscribers();
		PILLOG.Write("PUSH "+iTop+"\n");
	}
	
	public void PILPop() {
		if(iPILSize==0)
			return ;
		iPILSize=iPILSize-1;
		piPILList[iPILSize]=0;
		iPILTop=piPILList[iPILSize-1];
		PUBNotifyAllSubscribers();
		PILLOG.Write("POP\n");
	}
	
	public void PILClear() {
		for(int i=0;i<10;i++)
			this.piPILList[i]=0;
		this.iPILSize=0;
		this.iPILTop=0;
		PUBNotifyAllSubscribers();
		PILLOG.Write("CLEAR\n");
	}
	
	public void PILLogWrite(String Str) {
		PILLOG.Write(Str);
	}
}

