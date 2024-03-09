package polimorfismo.testes;

import java.util.ArrayList;
import java.util.List;

import polimorfismo.classes.ArquivoDAOImpl;

import polimorfismo.classes.GenericDAO;

public class DAOteste {

	public static void main(String[] args) {
		GenericDAO arquivoDAO = new ArquivoDAOImpl();
		arquivoDAO.save();
		List<String> lista = new ArrayList<>();
		lista.add("Ricardo");
		lista.add("Priscila");
		lista.add("Marcela");
		lista.add("Claudia");
		System.out.println("Nomes da Lista : " + lista);
		for(String nome: lista) {
			System.out.println("Nomes: " + nome);
		}
		
		
		
		

	}
}
