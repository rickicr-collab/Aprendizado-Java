package exception.teste;
/*
 * TRABALHANDO COM EXCEÇÕES COM SOBREESCRITA OU OVERRIDE:
 * 
 * REGRAS:
 * 1: AO CHAMARMOS O MÉTODO ATRAVAS DA CLASSE FILHA NÃO IRA CAUSAR NENHUM 
 * ERRO DE COMPILAÇÃO PORQUE O MÉTODO FOI SOBREESCRITO 
 * E NÃO FOI LANCADA NENHUMA EXCEÇÃO DENTRO DA CLASSE FILHA 
 * 
 * 2: VOCE PODE DELCARAR UMA MAIS EXCEÇÕES DENTRO DE UM MÉTODO.
 * 
 * 3: NÃO SE PODE DECLARA UMA ECEÇÃO QUE NÃO FOI DECLARADA NA SUPER CLASSE E
 * NO ENTANTO HA POSSIBILIDADE DE DECALARAR EXCEPTIONS DO TIPO RUNTIMEEXCEPTION
 * 
 * 4: PODE SE DECLARAR UMA EXCEPTION COMO RUNTIMEEXCEPTION E EM OUTRA CLASSE HERDEIRA
 * PODE SE DECLARA UMA EXCEPTION TIPO FILHA DESSA MESMA EXCEPTION 
 */

import java.io.FileNotFoundException;
import java.io.IOException;

import checkedexception.classes.Funcionario;
import checkedexception.classes.Pessoa;
import customexceptions.LoginInvalidoException;

public class SobreEscritaComExceptionTeste {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		Pessoa p = new Pessoa();
		
		try {
			System.out.println("testando o try");
			p.salvar();
			throw new LoginInvalidoException();
		} catch (IOException e) {
			System.out.println("Arquivo Não encontrado");
			e.printStackTrace();
		} catch (LoginInvalidoException e) {
			System.out.println("Login Invalido");
			e.printStackTrace();
		}finally {
			System.out.println("dentro do finally");
		}
		
		try {
			f.salvar();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
