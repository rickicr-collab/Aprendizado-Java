package teste;

import classes.dominio.Carro;

public class CarroTest {
	public static void main(String[] args) {
		Carro c = new Carro();
		//INICIALIZANDO O OBJETO ATRIBUINDO VALORES AOS ATRIBUTOS DA CLASSE CARRO
		c.modelo = "Corolla";
		c.placa = "QYP-1425";
		c.velocidadeMaxima = 180.0f;
		
		//VALORES IMPRESSOS SERÃO OS VALORES DE CLASSES PRIMITIVAS PADRÃO
		System.out.println(c.modelo);
		System.out.println(c.placa);
		System.out.println(c.velocidadeMaxima);
		System.out.println(c.MedidorVelocidade(185));
	}

	

}
