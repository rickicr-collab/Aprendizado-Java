package Controledefluxo.atualizado;

public class Exercise02 {

	public static void main(String[] args) {
		tituloGerador();
		int diaDaSemana = 7;
		String situacao;
		switch(diaDaSemana) {
		case 1:
		case 7:
			situacao = "FDS";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			situacao = "Dia Util";
			break;
		default:
			situacao = "Dia inexistente";
			break;
		}
		System.out.println("Verificador Situação: " + situacao);

	}
	
	public static void tituloGerador() {
		System.out.println("---------------------------------------------------------");
		System.out.println("           Exercicio Estrutura Swicth                    ");
		System.out.println("---------------------------------------------------------");
	}

}
