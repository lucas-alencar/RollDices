package maven;

import java.io.IOException;

public class Main {
	public static void main(String args[]) throws Exception {
		int[] testes = {5, 10, 25, 50, 150, 300, 450};
		rollDices rolldice;
		long start, elapsed;
		
		for(int testeAtual : testes) {
			for(int i=0;i<20;i++) {
				start = System.currentTimeMillis();
				for(int j=0;j<testeAtual;j++) {
					Thread.sleep(100);
					/*rolldice = new rollDices();
					rolldice.roll();*/
				}
				elapsed = System.currentTimeMillis() - start;
				System.out.println("Tempo passado no teste "+testeAtual+
						" Versão "+ (i+1)+ ": "+elapsed+"ms");
			}
		}
	}
}
