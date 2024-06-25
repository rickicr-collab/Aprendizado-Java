package exception.teste;

import java.io.FileNotFoundException;

import checkedexception.classes.Funcionario;
import checkedexception.classes.Pessoa;
import exceptions.custom.LoginInvalidoException2;

public class SobreEscritaException01 {

    public static void main(String[] args) {
	
	Pessoa pessoa = new Pessoa();
	Funcionario funcionario = new Funcionario();
	funcionario.salvar();
	try {
	    pessoa.salvar();
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (LoginInvalidoException2 e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

}
