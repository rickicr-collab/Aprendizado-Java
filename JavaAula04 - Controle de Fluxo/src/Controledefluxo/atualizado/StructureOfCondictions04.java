package Controledefluxo.atualizado;

public class StructureOfCondictions04 {

	public static void main(String[] args) {
		tituloGerador();
		verificadorSemana(5);
		verificadorSexo('F');
		
	

	}
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("                Estrutura Condicional  - switch               ");
		System.out.println("--------------------------------------------------------------");
		System.out.println("<<< Trabalhando com Método switch >>>");
	}
	
	public static void verificadorSemana(int diaDaSemana) {
		System.out.println("-------------------------");
		System.out.println("Verificando dia da Semana");
		String situacao="";
		switch(diaDaSemana) {
		case 1:
			situacao = "Domingo";
			break;
		case 2:
			situacao = "Segunda-Feira";
			break;
		case 3:
			situacao = "Terca-Feira";
			break;
		case 4:
			situacao = "Quarta - Feira";
			break;
		case 5:
			situacao = "Quinta - Feira";
			break;
		case 6:
			situacao = "Sexta - Feira";
			break;
		case 7:
			situacao = "Sabado";
			break;
		default:
			situacao = "Dia da semana inexistente";
			break;
		}
		System.out.println("Dia da Semana: " + situacao);
	}
	
	public static void verificadorSexo(char sexo) {
		System.out.println("--------------------");
		System.out.println("Verificador Sexo");
		String situacao = "";
		switch(sexo) {
		case 'F':
			situacao = "Sexo - Feminino";
			break;
		case 'M':
			situacao = "Sexo - Masculino";
			break;
		default:
			situacao = "Sexo Inexistente";
		}
		System.out.println("Situacao: " + situacao);
	}

}
