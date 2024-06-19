package polimorfismo.testes;

import polimorfismo.repositorio.Repositorio;
import polimorfismo.servico.RepositorioArquivo;
import polimorfismo.servico.RepositorioBancoDeDados;
import polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
	RepositorioBancoDeDados RepositorioBD =  new RepositorioBancoDeDados();
	RepositorioBD.save();
	
	Repositorio repositorio = new RepositorioMemoria();
	Repositorio repositorio1 = new RepositorioArquivo();
	repositorio.save();
	repositorio1.save();
    }

}
