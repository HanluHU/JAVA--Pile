
public class Command {
	private String STRCMD;
	
	public Command() {
		try {
			System.out.println("Please enter your command(enter q to quit): ");
			byte[] b = new byte[1024];
			int n = System.in.read(b);
			STRCMD = new String(b,0,n);
		}catch(Exception exc) {}
	}
	
	public String CMDGetCmd() {
		return STRCMD;
	}
	
	public void CMDReadcommand(Pile PIL) {
		if(STRCMD.compareTo("POP\r\n")==0) {
			if(PIL.PILGetSize()==0)
				System.out.println("Pile is empty. Cannot Pop.");
			else
				PIL.PILPop();
		}
			
		else if(STRCMD.compareTo("CLEAR\r\n")==0)
			PIL.PILClear();
		else if(STRCMD.compareTo("q\r\n")==0)
			System.exit(0);
		else if(STRCMD.startsWith("PUSH")&&STRCMD.charAt(4)==' ')
		{
			if(PIL.PILGetSize()==10)
				System.out.println("Pile is full. Cannot Push.");
			else {
				String Str=STRCMD.substring(5,STRCMD.indexOf("\r"));
				int iTop=Integer.parseInt(Str);
				PIL.PILPush(iTop);
			}
		}
		else if(STRCMD.compareTo("SET WARN 1\r\n")==0) {
			PIL.PILSetWarn(new Warn1(PIL));
			PIL.PILLogWrite("SET WARN 1\n");
		}
			
		else if(STRCMD.compareTo("SET WARN 2\r\n")==0) {
			PIL.PILSetWarn(new Warn2(PIL));
			PIL.PILLogWrite("SET WARN 2\n");
		}
		else 
			System.out.println("Invalid syntax.");
	}
}
