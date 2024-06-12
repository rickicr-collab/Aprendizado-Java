package associacao.teste;

import associacao.classes.Jogador;
import associacao.classes.Time;

public class JogadorTimeTest {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Ricardo");
		Jogador jogador2 = new Jogador("Pelé");
		Jogador jogador3 = new Jogador("Romario");
		Time time = new Time("Seleção Brasileira");
		jogador1.setTime(time);
		jogador2.setTime(time);
		jogador3.setTime(time);
		
		jogador1.imprime();
		jogador2.imprime();
		jogador3.imprime();
	

	}
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------");
		System.out.println("             Associação Um para muitos            ");
		System.out.println("--------------------------------------------------");
	}


}
