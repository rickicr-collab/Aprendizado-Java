package polimorfismo.servico;

import polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void save() {
	System.out.println("Saved at a DataBase!");
	
    }
    
    

}
