package checkedexception.classes;

import java.io.FileNotFoundException;

import exceptions.custom.LoginInvalidoException2;

public class Pessoa {

    public void salvar() throws LoginInvalidoException2, FileNotFoundException {
	System.out.println("Testando a sobre escrita de exceções !!!!");

    }

}
