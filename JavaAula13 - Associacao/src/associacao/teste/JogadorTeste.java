package associacao.teste;

import associacao.classes.Jogador;

public class JogadorTeste {

	public static void main(String[] args) {
		Jogador j1 = new Jogador("Ricardo");
		Jogador j2 = new Jogador("Cafu");
		Jogador j3 = new Jogador("Romário");
		Jogador[] jogadores = new Jogador[] {j1, j2, j3};
		for(Jogador j : jogadores) {
			j.imprime();
		}
		
		

	}
	
	

}
