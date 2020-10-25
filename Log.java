
import java.io.*;  // Import the IO classes


public class Log {
	private File file;
	
	public Log(String FileName) { //constructor
		try {
			file = new File(FileName);
			if(!file.exists()) //if file doesn't exists, then create it
				file.createNewFile();
		}catch(Exception exc) {}
		
	}
	
	public void Write(String command) { 
		try {
			FileWriter fileWritter = new FileWriter(file.getName(),true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write(command);
			bufferWritter.close();
		}catch(Exception exc) {}
		
	}
}

