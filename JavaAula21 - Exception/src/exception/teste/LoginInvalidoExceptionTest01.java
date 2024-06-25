package exception.teste;

import java.util.Scanner;

import exceptions.custom.LoginInvalidoException2;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args)  {
	try {
	    logar();
	} catch (LoginInvalidoException2 e) {
	    e.printStackTrace();
	}

    }

    public static void logar() throws LoginInvalidoException2 {
	@SuppressWarnings("resource")
	Scanner teclado = new Scanner(System.in);
	String userNameDB = "Admin";
	String passWordDB = "Senha";

	System.out.print("Digite o login: ");
	String loginName = teclado.nextLine();
	System.out.print("Digite a Senha: ");
	String loginSenha = teclado.nextLine();
	
	if(!userNameDB.equals(loginName) || !passWordDB.equals(loginSenha)) {
	    throw new LoginInvalidoException2("User or PassWord incorrects try again!!!");
	}
	System.out.println("Login executed with Sucess!");
	
	
    }

}
