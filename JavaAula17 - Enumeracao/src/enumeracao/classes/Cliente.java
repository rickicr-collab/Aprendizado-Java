package enumeracao.classes;

/*
 * TRABALHANDO COM A FUNÇÃO ENUMERATE DENTRO DO JAVA 
 * PARA EVITAR CASOS ONDE VOCE NÃO NECESSITA DE VARIAVVEIS STATICAS FINAIS 
 * PARA SE TRABALHAR NUM DETERMINADO PROJETO FOI CRIADO O TIPO ESPECIAL DE ATRIBUTO / CLASSE
 * CHAMADO ENUMERAÇÕES OU ENUMERATE A PARTIR DO JAVA 5
 * AO CRIAR UM NOVO OBJETO NO METODO PRINCIPAL MAIN VOCE INSTANCIA O ATRIBUTO 
 * DA CLASSE ENUMERADA TIPO CLIENTE COMO SE TIVESSE INSTANCIAOD UM ATRIBUTO DE CLASSE
 * OBS:NÃO PODE PASSAR O ATRIBUTO COMO TIPO PRIMITIVO POIS DARÁ UM ERRO DE COMPILAÇÃO.
 * 
 * PARTE 2
 * OBS:EXISTE A OPCÃO DE VC INFORMAR OA PARAMENTROS DA CLASSE TIPOCLINTE DENTRO DA CLASSE CLIENTE
 * OBS2: VOCE TAMBEM PODE CRIAR UMA NOVA ENUMERAÇÃO DENTRO DE UMA CLASSE DESDE QUE SIGA AS REGRAS DE CONVERSÃO NORMAIS ESTABELECIDAS.
 * OBS3: VOCE TAMBEM PODE COLOCAR MODIFICADORES DE ACESSO NAS ENUMERAÇÕES DECLARADAS EM UMA CLASSE.
 * OBS4: NÃO É POSSIVEL OU PERMITIDO CRIAR UMA ENUMERAÇÃO DENTRO DE UM METODO O JAVA E A JVM IMPEDE A CRIAÇÃO DO MESMO.
 * OBS5: COMO A ENUMERAÇÃO É UM TIPO DE CLASSE ESPECIAL É POSSIVEL ADICIONAR ATRIBUTOS E MÉTODOS A MESMA.
 */

public class Cliente {

		

	public enum TipoPagamento{	
		AVISTA, APRAZO;
	}
	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;
	
	
	//CONSTRUTOR
	
	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}
	
	@Override
	public String toString() {
		return "Cliente{" +
				"Nome='" + this.nome + '\'' +
				", tipoCliente=" + tipoCliente.getNome() +
				", tipoPagamento=" + tipoPagamento +
				", numero=" + tipoCliente.getTipo()+
				'}';
				
	}

	
	//METDO GETTER AND SETTERS
	public String getNome() {
		return nome;
	}
	
	public TipoCliente getTipo() {
		return tipoCliente;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
