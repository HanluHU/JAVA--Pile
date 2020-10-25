
public class Stock implements Subscriber {
	private int iSTKTop;
	private int iSTKSize;
	private int[] piSTKList;
	
	public void SUBUpdate(Pile PIL) {
		iSTKTop=PIL.PILGetTop();
		iSTKSize=PIL.PILGetSize();
		piSTKList= PIL.PILGetList();
		STKDisplayTop();
		STKDisplay();
	}
	
	public void STKDisplayTop() {
		if(iSTKSize!=0)
			System.out.println("Top : "+iSTKTop);
		else 
			System.out.println("Top : ");
	}
	
	public void STKDisplay() {
		System.out.print("Stock :");
		for(int i=0;i<iSTKSize;i++) {
			System.out.print(" "+piSTKList[i]);
		}
		System.out.print("\n");
	}
}
