package teste;

import classes.dominio.Estudante;

public class EstudanteTest {
	/*
	 * METODO MAIN PRINCIPAL PARA SE TRABALHAR COM OBJETOS E SEPARAR AS RESPONSABILIDADES
	 * DENTRO DAS CLASSES E NÃO SOBRECARREGA-LAS
	 */
	public static void main(String[] args) {
		
		//CRIANDO A VARIAVEL E ATRIBUINDO UM NOVO OBJETO DO TIPO ESTUDANTE
		Estudante a = new Estudante();
		
		//ATRIBUTOS DA VARIAVEL A:
		a.nome = "Ricardo";
		a.idade = 35;
		a.matricula = "1212";
		
		//IMPRIMINDO OS VALORES DOS ATRIBUTOS
		System.out.println(a.nome);
		System.out.println(a.idade);
		System.out.println(a.matricula);
		
		
	}

}
