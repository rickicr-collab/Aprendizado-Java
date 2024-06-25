package runtimeexceptions.teste;

import exceptions.custom.LoginInvalidoException;

public class CustomExceptionTeste {

	public static void main(String[] args) {
		logar();

	}
	
	public static void logar(){
		System.out.println("Simulando uma execption num login");
		String usuarioBancoDeDados = "Ricardo";
		String senhaBancoDeDados= "1804";
		String usuarioDigitado = "Ricardo";
		String senhaDigitada = "2004";
		try {
			if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
				throw new LoginInvalidoException();
			}else {
				System.out.println("Login executado com sucesso!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
		
}
