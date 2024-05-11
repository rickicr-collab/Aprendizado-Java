package colecoes.teste;

import colecoes.classe.Celular;

public class EqualsTeste {
	
	public static void main(String[] args) {
		System.out.println("<<<< Trabalhando com Coleçoes >>>>>");
		System.out.println("Método Equals");
		System.out.println("-----------------------------------");
		System.out.println("Exemplo 01");
		String nome1 = "Ricardo Cunha";
		String nome2 = new String("Ricardo Cunha");
		Integer num1 = 5;
		Integer num2 = Integer.valueOf(5);
		System.out.println("Os valores são iguals? " + nome1.equals(nome2));
		System.out.println("Os valores são iguals? " + num2.equals(num1));
		System.out.println("-----------------------------------");
		System.out.println("Exemplo 02");
		Celular phone1 = new Celular("Iphone", "1234");
		Celular phone2 = new Celular("Samsung","1234");
		System.out.println("Ambos os telefones são iguais? " + phone1.equals(phone2));
		System.out.println("-----------------------------------");
		System.out.println("<<<< Trabalhando com método hashdcode >>>>");
		System.out.println("Exemplo 01");
		System.out.println("hashcode phone1 ? " + phone1.hashCode());
		System.out.println("Hashcode phone2 ? " + phone2.hashCode());
		
		
		
		

	}

}
