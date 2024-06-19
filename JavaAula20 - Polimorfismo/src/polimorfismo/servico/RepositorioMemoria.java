package polimorfismo.servico;

import polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void save() {
	System.out.println("Saved in the Memmory!");
    }
    
    

}
