package Controledefluxo.atualizado;

public class StructureOfCondictions03 {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("utilizando método if - else");
		double salario = 6000;
		double salario2 = 3000;
		String mensagemDoar = "Eu vou doar 500 ao DevDojo";
		String mensagemNaoDoar = "Eu ainda não tenho condições para doar ,  mais vou ter!";
		String resultado;
		if(salario > 5000) {
			resultado = mensagemDoar;
		}else {
			resultado = mensagemNaoDoar;
		}
		System.out.println("Resultado: " + resultado);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Utilizando operador ternário");
		String resultado2 = (salario2 > 5000)? mensagemDoar : mensagemNaoDoar;
		System.out.println("Resultado: " + resultado2);
		

	}
	
	public static void tituloGerador() {
		System.out.println("-----------------------------------------------------");
		System.out.println("               Operatores Ternários                  ");
		System.out.println("-----------------------------------------------------");
	}

}
