package polimorfismo.dominio;

public abstract class Produto implements Taxamento {
    protected String nome;
    protected double valor;
    
    static{
	System.out.println("---------------------------------------------");
	System.out.println("        Introdução a Polimorfismo            ");
	System.out.println("---------------------------------------------");
    }
    
    
    public Produto(String nome, double valor) {
	this.nome = nome;
	this.valor = valor;
    }



    public String getNome() {
        return nome;
    }


    public double getValor() {
        return valor;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    

}
