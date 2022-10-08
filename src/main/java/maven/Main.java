package maven;

import java.io.File;

public class Main {
	public static void main(String args[]) throws Exception {
		
		//Serão realizados os sete testes abaixo, cada um, 20 vezes
		final int[] testes = {5,10,25,50,150,300,450};
		final int amountTimes = 20;
		SaveFiles saveFile;
		RollDices rolldices = new RollDices();
		long timeStart, timeElapsed;
		
		for(int testeAtual : testes) {
			String path = new File(".").getCanonicalPath() + "/fileOutput/output"+testeAtual+".txt";
			System.out.println("The file will be saved in path: " + path);
			saveFile = new SaveFiles(path);
			System.out.println("starting "+testeAtual+"-pack test");
			
			for(int i=0;i<amountTimes;i++) {
				timeStart = System.currentTimeMillis();
				
				for(int j=0;j<testeAtual;j++) {
					rolldices.roll();
				}
				
				timeElapsed = System.currentTimeMillis() - timeStart;
				saveFile.save(testeAtual, i, timeElapsed);
			}
			System.out.println(testeAtual+"-pack test completed");
			saveFile.close();
		}
		
	}
}
