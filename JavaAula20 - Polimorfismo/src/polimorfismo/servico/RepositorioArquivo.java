package polimorfismo.servico;

import polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio  {

    @Override
    public void save() {
	System.out.println("Saved in the File!");
	
    }
    
    

}
