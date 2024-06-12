package associacao.teste;

import associacao.classes.Jogador;
import associacao.classes.Time;

public class JogadorTimeTest02 {

	public static void main(String[] args) {
		tituloGerador();
		Jogador jogador1 = new Jogador("Cafu");
		Jogador jogador2 = new Jogador("Ricardo");
		Jogador jogador3 = new Jogador("Romario");
		Jogador[] jogadores = {jogador1, jogador2, jogador3};
		Time time = new Time("Seleção Brasileira", jogadores);
		System.out.println(" --- Referencia do Time ---");
		time.imprime();
		
		System.out.println(" --- Referencia do Jogador -- ");
		jogador1.setTime(time);
		jogador1.imprime();
		
		

	}
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------");
		System.out.println("             Associação Bidirecional              ");
		System.out.println("--------------------------------------------------");
	}

}
