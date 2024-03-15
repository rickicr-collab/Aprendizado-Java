package customexceptions;

/*
 * EXCEPTIONS CUSTOMERS:
 * 
 * É UM BOA PRATICA COLOCAR O NOMES DAS CLASSES DE TRATAMENTOS DE EXCEÇÕES 
 * COM FINAIS EXCEPTION.
 * 
 * OBS1: AO CRIAR UMA CLASSE PARA TRATAMENTO DE EXCEÇÕES DEVE SE EXTENDER A CLASSE EXCEPTION.
 * 
 * OBS2: COMO BOAS PRATICAS AO REALIZAR EXCEÇÕES CUSTOMIZADAS NUNCA COLOQUEM MÉTODOS DENTRA DA CLASSE
 * REALIZANDO OS TRATAMENTOS DE EXCEÇOES DENTRO DE UMA CLASSE ESPECIFICA POIS O TEMPO DE VIDA 
 * DE UM SOFTWARE É MUITO CURTO E A EXCEÇÃO PODE NÃO SER MAIS VIAVEL.
 * 
 * 
 */

public class LoginInvalidoException extends Exception {
	
	public LoginInvalidoException() {
		super("Login e Senha Invalidos!!!");
		
	}

	
	
	

}