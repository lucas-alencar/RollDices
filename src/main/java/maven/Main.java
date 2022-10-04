package maven;

import java.io.File;

public class Main {
	public static void main(String args[]) throws Exception {
		int[] testes = {5, 10, 25, 50, 150, 300, 450};
		RollDices rolldice;
		long start, elapsed;
		
		String path = new File(".").getCanonicalPath() + "/fileOutput/output.txt";
		System.out.println("The file will be saved in path: " + path);
		SaveFile saveFile = new SaveFile(path);
		
		for(int testeAtual : testes) {
			 System.out.print("iniciando teste de "+testeAtual+" pacotes, ");
			for(int i=0;i<20;i++) {
				start = System.currentTimeMillis();
				for(int j=0;j<testeAtual;j++) {
					/*rolldice = new RollDices();
					rolldice.roll();*/
				}
				
				elapsed = System.currentTimeMillis() - start;
				saveFile.save(testeAtual, i, elapsed);
			}
			System.out.println("teste de "+(testeAtual)+" pacotes Concluído.");
		}
		saveFile.close();
	}
}
