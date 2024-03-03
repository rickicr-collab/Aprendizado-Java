package interfaces.testes;

import interfaces.classe.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p = new Produto("Notebook", 4, 3000);
		System.out.println("<<<< Imprimindo em Tela >>>>");
		p.calcularFrete();
		p.calcularTributo();
		System.out.println(p);

	}

}
