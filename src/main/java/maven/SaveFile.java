package maven;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveFile {
	private final FileWriter fileWriter;
	private final PrintWriter printWriter;
	
	public SaveFile(String path) throws IOException {
		
		
		this.fileWriter = new FileWriter(path);
		this.printWriter = new PrintWriter(fileWriter);
	}
	
	public boolean save(int currentTest,int version, long timeElapsed) {
		printWriter.printf("Tempo passado no teste " + currentTest + " Versão " + (version+1) + ": " + timeElapsed + "ms\n");
		return true;
	}
	
	public boolean close() throws IOException {
		this.fileWriter.close();
		return true;
	}
	
	
	
	
}
